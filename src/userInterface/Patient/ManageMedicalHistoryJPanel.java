/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Patient;

import business.Patient.Encounter;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Abhishek
 */
public class ManageMedicalHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicalHistoryJPanel
     */
    private JPanel userProcessConatiner;
    private UserAccount userAccount;
    public ManageMedicalHistoryJPanel(JPanel userProcessConatiner,UserAccount userAccount) {
        initComponents();
        this.userProcessConatiner = userProcessConatiner;
        this.userAccount = userAccount;
        populateEncounter();
        
    }
    
    private void populateEncounter()
    {
        DefaultTableModel model = (DefaultTableModel) encounterJTable.getModel();
        model.setRowCount(0);
        if(userAccount.getEncounterDirectory().getEncounterList()!=null)
        {
          for(Encounter e : userAccount.getEncounterDirectory().getEncounterList())
           {
            Object [] row = new Object[3];
            row[0] = e;
            row[1] = e.getEncounterDate();
            row[2] = e.getDoctorName().getPerson().getFirstName()+" "+e.getDoctorName().getPerson().getLastName();
            model.addRow(row);
        
         }
        }
        
        
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewAppointmentDetailsJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        siteNameJTextField = new javax.swing.JTextField();
        vaccineJTextField = new javax.swing.JTextField();
        symptomJTextField = new javax.swing.JTextField();
        priceJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        bloodPressureJTextField = new javax.swing.JTextField();
        reportAllergyJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel1.setText("Manage Medical History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 23, -1, -1));

        encounterJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(encounterJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 95, -1, 145));

        jLabel2.setText("Site Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 349, -1, -1));

        viewAppointmentDetailsJButton.setText("View Appointment Details");
        viewAppointmentDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewAppointmentDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel3.setText("Vaccine :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 389, -1, -1));

        jLabel4.setText("Symptom  :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 435, -1, -1));

        jLabel6.setText("Fee Paid :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 483, -1, -1));

        siteNameJTextField.setEditable(false);
        siteNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteNameJTextFieldActionPerformed(evt);
            }
        });
        add(siteNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 346, 192, -1));

        vaccineJTextField.setEditable(false);
        add(vaccineJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 386, 192, -1));

        symptomJTextField.setEditable(false);
        add(symptomJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 432, 193, -1));

        priceJTextField.setEditable(false);
        add(priceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 193, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 31, -1, -1));

        jLabel5.setText("Respiratory Rate :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 349, -1, -1));

        jLabel7.setText("Heart Rate :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 389, -1, -1));

        jLabel8.setText("Weight :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 435, -1, -1));

        jLabel9.setText("Blood Pressure :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 483, -1, -1));

        respiratoryRateJTextField.setEditable(false);
        respiratoryRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryRateJTextFieldActionPerformed(evt);
            }
        });
        add(respiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 346, 173, -1));

        heartRateJTextField.setEditable(false);
        heartRateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateJTextFieldActionPerformed(evt);
            }
        });
        add(heartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 386, 173, -1));

        weightJTextField.setEditable(false);
        weightJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTextFieldActionPerformed(evt);
            }
        });
        add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 432, 173, -1));

        bloodPressureJTextField.setEditable(false);
        bloodPressureJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPressureJTextFieldActionPerformed(evt);
            }
        });
        add(bloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 480, 173, -1));

        reportAllergyJButton.setText("Report A Allergic Reaction");
        reportAllergyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportAllergyJButtonActionPerformed(evt);
            }
        });
        add(reportAllergyJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 557, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void siteNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteNameJTextFieldActionPerformed

    private void respiratoryRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryRateJTextFieldActionPerformed

    private void heartRateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateJTextFieldActionPerformed

    private void weightJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightJTextFieldActionPerformed

    private void bloodPressureJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPressureJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureJTextFieldActionPerformed

    private void reportAllergyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportAllergyJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportAllergyJButtonActionPerformed

    private void viewAppointmentDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = encounterJTable.getSelectedRow();
        if(rowSelected<0)
        {
            JOptionPane.showMessageDialog(null,"No row is selected");
            return;
            
        
        }
        
        Encounter e = (Encounter) encounterJTable.getValueAt(rowSelected, 0);
        
        respiratoryRateJTextField.setText(String.valueOf(e.getVitalSign().getRespiratoryRate()));
        heartRateJTextField.setText(String.valueOf(e.getVitalSign().getHeartRate()));
        bloodPressureJTextField.setText(String.valueOf(e.getVitalSign().getSystolicBloodPressure()));
        weightJTextField.setText(String.valueOf(e.getVitalSign().getWeight()));
        
        siteNameJTextField.setText(e.getEncounterPlaceName());
        vaccineJTextField.setText(e.getVaccine().getVaccineName());
        symptomJTextField.setText(e.getEncounterDetails());
        priceJTextField.setText(String.valueOf(e.getEncounterAmount()));
        
        
    }//GEN-LAST:event_viewAppointmentDetailsJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessConatiner.remove(this);
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JTable encounterJTable;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JButton reportAllergyJButton;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JTextField siteNameJTextField;
    private javax.swing.JTextField symptomJTextField;
    private javax.swing.JTextField vaccineJTextField;
    private javax.swing.JButton viewAppointmentDetailsJButton;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
