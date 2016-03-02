/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Sites.Doctor;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.PHDEnterprise;
import business.Enterprise.SiteEnterprise;
import business.Patient.Encounter;
import business.Patient.EncounterDirectory;
import business.Patient.VitalSign;
import business.PaymentTransaction.Transaction;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.Vaccine.Batch;
import business.Vaccine.Vaccine;
import business.Vaccine.VaccineType;
import business.WorkQueue.PatientBillPaymentWorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AddPatientEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientEncounterJPanel
     */
    private JPanel userProcessContainer;
    private EncounterDirectory patientEncounterDirectory;
    private EncounterDirectory doctorEncounterDirectory;
    private SiteEnterprise siteEnterprise;
    private UserAccount patientUserAccount;
    private UserAccount doctorUserAccount;
    private EcoSystem ecoSystem;
    
    public AddPatientEncounterJPanel(JPanel userProcessContainer,EcoSystem ecoSystem, SiteEnterprise siteEnterprise,UserAccount patientUserAccount,UserAccount doctorUserAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.siteEnterprise = siteEnterprise;
        this.patientUserAccount = patientUserAccount;
        this.doctorUserAccount = doctorUserAccount;
        this.patientEncounterDirectory = patientUserAccount.getEncounterDirectory();
        this.doctorEncounterDirectory = doctorUserAccount.getEncounterDirectory();
        this.ecoSystem = ecoSystem;
        populateVaccineType();
    }
    
    private void populateVaccineType()
    {
        vaccTypeJComboBox.removeAllItems();
        
        for(VaccineType type : ecoSystem.getVaccineDirectory().getVaccineList())
        {
            vaccTypeJComboBox.addItem(type);
        
        }
    
    }
    
    private Vaccine checkVaccineAvailability(String vaccName)
    {
                Vaccine vaccine = null;
                if(!siteEnterprise.getBatchDirectory().getBatchList().isEmpty())
                {
                for(Batch b : siteEnterprise.getBatchDirectory().getBatchList())
                {
                    if(b.getAvailability()>0 && b.getBatchName().equals(vaccName))
                    {
                        for(Vaccine v : b.getVaccineList())
                        {
                            vaccine = v;
                            b.setAvailability(b.getAvailability()-1);
                            break;
                        
                        }
                    
                    }
                    if(vaccine!=null)
                    {
                        break;
                    
                    }
                }
                }
                 return vaccine;
    }
    
    
    private void payPatientInsuranceBill(UserAccount patAccount, float bill)
    {
        
         if (patAccount.getPerson().getInsurance() == null) {
            UserAccount phdAdmin = getPHD();
            UserAccount siteAdmin = getSiteAdminAccount();

            if (phdAdmin != null && siteAdmin != null) {
                PatientBillPaymentWorkRequest pbpwr = new PatientBillPaymentWorkRequest();
                pbpwr.setBillAmount(bill);
                pbpwr.setFromSiteAccount(getSiteAdminAccount().getAccountNumber());
                pbpwr.setToPHDAccount(getPHD().getAccountNumber());
                pbpwr.setSiteEnterprise(siteEnterprise);
                pbpwr.setPatient(patAccount.getPerson());
                pbpwr.setStatus("Pending");
                phdAdmin.getWorkQueue().getPatientBillPaymentWorkRequest().add(pbpwr);
            }
        } else if (patAccount.getPerson().getInsurance().getLeftClaimAmount()== 0) {
            UserAccount phdAdmin = getPHD();
            UserAccount siteAdmin = getSiteAdminAccount();

            if (phdAdmin != null && siteAdmin != null) {
                PatientBillPaymentWorkRequest pbpwr = new PatientBillPaymentWorkRequest();
                pbpwr.setBillAmount(bill);
                pbpwr.setFromSiteAccount(getSiteAdminAccount().getAccountNumber());
                pbpwr.setToPHDAccount(getPHD().getAccountNumber());
                pbpwr.setSiteEnterprise(siteEnterprise);
                pbpwr.setPatient(patAccount.getPerson());
                pbpwr.setStatus("Pending");
                phdAdmin.getWorkQueue().getPatientBillPaymentWorkRequest().add(pbpwr);
            }

        } else if (patAccount.getPerson().getInsurance() != null || patAccount.getPerson().getInsurance().getLeftClaimAmount()> 0) {
            UserAccount phdAdmin = getPHD();
            UserAccount siteAdmin = getSiteAdminAccount();
            if (patAccount.getPerson().getInsurance().getLeftClaimAmount()>= bill) {
                Transaction t = new Transaction();
                t.setAmount(bill);
                t.setToAccount(siteAdmin.getAccountNumber());
                Calendar cal = Calendar.getInstance();
                t.setDate(cal.getTime());
                t.setFromAccount(patAccount.getAccountNumber());
                t.setInsurance(patAccount.getPerson().getInsurance());
                float unclaimedAmount = patAccount.getPerson().getInsurance().getLeftClaimAmount()- bill;
                patAccount.getPerson().getInsurance().setLeftClaimAmount(unclaimedAmount);
                siteAdmin.getAccountNumber().getTransaction().add(t);
                float newAmount = siteAdmin.getAccountNumber().getBalance() + bill;
                siteAdmin.getAccountNumber().setBalance(newAmount);

            } else {
                Transaction t = new Transaction();

                t.setToAccount(siteAdmin.getAccountNumber());
                Calendar cal = Calendar.getInstance();
                t.setDate(cal.getTime());
                t.setFromAccount(patAccount.getAccountNumber());
                t.setInsurance(patAccount.getPerson().getInsurance());

                float paidAmount = patAccount.getPerson().getInsurance().getLeftClaimAmount();
                patAccount.getPerson().getInsurance().setLeftClaimAmount(0);
                t.setAmount(bill);

                siteAdmin.getAccountNumber().getTransaction().add(t);
                float newAmount = siteAdmin.getAccountNumber().getBalance() + paidAmount;
                siteAdmin.getAccountNumber().setBalance(newAmount);

                PatientBillPaymentWorkRequest pbpwr = new PatientBillPaymentWorkRequest();
                pbpwr.setBillAmount(bill - paidAmount);
                pbpwr.setFromSiteAccount(getSiteAdminAccount().getAccountNumber());
                pbpwr.setToPHDAccount(getPHD().getAccountNumber());
                pbpwr.setSiteEnterprise(siteEnterprise);
                pbpwr.setPatient(patAccount.getPerson());
                pbpwr.setStatus("Pending");
                phdAdmin.getWorkQueue().getPatientBillPaymentWorkRequest().add(pbpwr);

            }
        }
    
    
    }
    
    private UserAccount getPHD()
    {
        PHDEnterprise phde = null;
        UserAccount userAccount = null;
        
        for(Enterprise enterprise : ecoSystem.getEnterpriseDirectory().getEnterpriseList())
        {
            if(enterprise instanceof PHDEnterprise)
            {
                PHDEnterprise pHDEnterprise = (PHDEnterprise)enterprise;
                if(pHDEnterprise.getStateName().equals(siteEnterprise.getStateName()))
                {
                    phde = pHDEnterprise;
                    break;
                }
            
            }
        
        }
    for(UserAccount ua : phde.getUserAccountDirectory().getUserAccountList())
    {
        if(ua.getRole().getRoleName().equals(Role.RoleType.PHDAdminRole.getValue()))
        {
            userAccount=ua;
            break;
        
        }
    
    }
        return userAccount;
    
    }
    
     public UserAccount getSiteAdminAccount() {
        UserAccount userAcc = null;

        for (UserAccount ua : siteEnterprise.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().getRoleName().equals(Role.RoleType.SiteAdminRole.getValue())) {
                userAcc = ua;
                break;
            }
        }
        return userAcc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doctorNameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diseaseTypeJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addPatientJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        weightJTextField = new javax.swing.JTextField();
        weightJLabel = new javax.swing.JLabel();
        systolicBloodPressureJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        heartRateJTextField = new javax.swing.JTextField();
        systolicBloodPressureJLabel = new javax.swing.JLabel();
        heartRateJLabel = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vaccTypeJComboBox = new javax.swing.JComboBox();
        vaccNameJComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Add Patient Encounter Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 39, -1, -1));

        jLabel2.setText("Doctor Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 130, -1, -1));

        doctorNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorNameJTextFieldActionPerformed(evt);
            }
        });
        add(doctorNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 127, 207, -1));

        jLabel6.setText("Vaccine Name :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 264, -1, -1));

        jLabel8.setText("Disease Type:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        diseaseTypeJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseTypeJTextFieldActionPerformed(evt);
            }
        });
        add(diseaseTypeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 207, -1));

        jLabel10.setText("Encounter Report:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 427, -1, -1));

        addPatientJButton.setText("Add Encounter");
        addPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientJButtonActionPerformed(evt);
            }
        });
        add(addPatientJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 737, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 427, 207, -1));
        add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 687, 180, -1));

        weightJLabel.setText("Weight");
        add(weightJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 697, -1, -1));
        add(systolicBloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 637, 180, -1));

        jLabel3.setText("Respiratory Rate");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 547, -1, -1));
        add(heartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 597, 180, -1));

        systolicBloodPressureJLabel.setText("Systolic Blood Pressure");
        add(systolicBloodPressureJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 647, -1, -1));

        heartRateJLabel.setText("Heart Rate");
        add(heartRateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 597, -1, -1));

        respiratoryRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateJTextFieldActionPerformed(evt);
            }
        });
        add(respiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 537, 180, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 39, -1, -1));

        jLabel4.setText("Vaccine Type :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 202, -1, -1));

        vaccTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vaccTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccTypeJComboBoxActionPerformed(evt);
            }
        });
        add(vaccTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 191, 207, 30));

        vaccNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(vaccNameJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 250, 211, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void doctorNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorNameJTextFieldActionPerformed

    private void respiratoryRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientJButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            float respiratoryRate = Float.parseFloat(respiratoryRateJTextField.getText());
            float heartRate = Float.parseFloat(heartRateJTextField.getText());
            float bloodPressure = Float.parseFloat(systolicBloodPressureJTextField.getText());
            float weight = Float.parseFloat(weightJTextField.getText());
            
            VaccineType vt = (VaccineType) vaccTypeJComboBox.getSelectedItem();
            String vaccineName = (String) vaccNameJComboBox.getSelectedItem();
            String disease = diseaseTypeJTextField.getText();
            String report = respiratoryRateJTextField.getText();
            
            if(!vaccineName.isEmpty())
            {
                if(!report.isEmpty())
                {
                    Vaccine vaccine = checkVaccineAvailability(vaccineName);
                    if(vaccine!=null)
                    {
                    Encounter encounter = new Encounter();
                    encounter.setDoctorName(doctorUserAccount);
                    encounter.setPatientName(patientUserAccount);
                    encounter.setEncounterDetails(report);
                    encounter.setEncounterPlaceName(siteEnterprise.getName());
                    encounter.setNoOfDose(1);
                    
                    VitalSign  vitalSign = new VitalSign();
                    vitalSign.setRespiratoryRate(respiratoryRate);
                    vitalSign.setHeartRate(heartRate);
                    vitalSign.setSystolicBloodPressure(bloodPressure);
                    vitalSign.setWeight(weight);
                    encounter.setVitalSign(vitalSign);
                    
                    float bill = vaccine.getvPrice();
                    
                    boolean flag = true;
                    if(vaccine.getVaccineType().getFundingInfo().equals(VaccineType.FEDERALLYFUNDED))
                    {
                         flag = false;
                         
                    }
                    else
                    {
                        for(String state : vaccine.getVaccineType().getStateFundedList())
                        {
                            if(state.equals(siteEnterprise.getStateName()))
                            {
                                flag = false;
                                break;
                            }
                        
                        }
                    
                    }
                    
                    if(flag == false)
                    {
                        encounter.setEncounterAmount(0);
                    
                    }
                    else
                    {
                        encounter.setEncounterAmount(vaccine.getvPrice());
                        payPatientInsuranceBill(patientUserAccount, bill);
                    
                    }
                    
                    patientEncounterDirectory.getEncounterList().add(encounter);
                    doctorEncounterDirectory.getEncounterList().add(encounter);
                    
                    
                    
                }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Vaccine "+vaccineName+" is out of stock");
                        
                    }
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Enter a encounter report");
                }
            
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Select a vaccine name");
            
            }
        
        
        }
        catch(NumberFormatException nfe)
        {
        
            JOptionPane.showMessageDialog(null, "Enter valid numbers for vital signs");
        
        }
        
        
        
    }//GEN-LAST:event_addPatientJButtonActionPerformed

    private void diseaseTypeJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseTypeJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseTypeJTextFieldActionPerformed

    private void vaccTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        VaccineType vt = (VaccineType) vaccTypeJComboBox.getSelectedItem();
        
        if(vt!=null)
        {
            for(Batch b : siteEnterprise.getBatchDirectory().getBatchList())
            {
                for(Vaccine v : b.getVaccineList())
                {
                    if(v.getVaccineType().getVaccineTypeName().equals(vt.getVaccineTypeName()) && b.getAvailability()>0)
                    {
                        vaccNameJComboBox.addItem(v.getVaccineName());
                        break;
                        
                    }
                }
            
            }
        
        }
    }//GEN-LAST:event_vaccTypeJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField diseaseTypeJTextField;
    private javax.swing.JTextField doctorNameJTextField;
    private javax.swing.JLabel heartRateJLabel;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JLabel systolicBloodPressureJLabel;
    private javax.swing.JTextField systolicBloodPressureJTextField;
    private javax.swing.JComboBox vaccNameJComboBox;
    private javax.swing.JComboBox vaccTypeJComboBox;
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
