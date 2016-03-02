/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Patient;

import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ManagePersonelDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonelDetailsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    
    public ManagePersonelDetailsJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        populateTextField();
    }
    
    private  void populateTextField()
    {
        firstNameJTextField.setText(userAccount.getPerson().getFirstName());
        lastNameJTextField.setText(userAccount.getPerson().getLastName());
        ssnJTextField.setText(String.valueOf(userAccount.getPerson().getSsn()));
        dobJTextField.setText(userAccount.getPerson().getDob());
        phoneNumberJTextField.setText(String.valueOf(userAccount.getPerson().getContactNo()));
        streetJTextField.setText(userAccount.getPerson().getAddress().getState());
        cityJTextField.setText(userAccount.getPerson().getAddress().getCity());
        stateJTextField.setText(userAccount.getPerson().getAddress().getState());
        zipcodeJTextField.setText(String.valueOf(userAccount.getPerson().getAddress().getZipcode()));
        
        policyIDJTextField.setText(String.valueOf(userAccount.getPerson().getInsurance().getPolicyID()));
        policyNameJTextField.setText(userAccount.getPerson().getInsurance().getPolicyTypeName());
        startDateJTextField.setText(String.valueOf(userAccount.getPerson().getInsurance().getPolicyStartDate()));
        endDateJTextField.setText(String.valueOf(userAccount.getPerson().getInsurance().getPolicyEndDate()));
        insuredAmountJTextField.setText(String.valueOf(userAccount.getPerson().getInsurance().getPolicyAmount()));
        leftInsuredAmountJTextField.setText(String.valueOf(userAccount.getPerson().getInsurance().getLeftClaimAmount()));
        
        
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lastNameJTextField = new javax.swing.JTextField();
        ssnJTextField = new javax.swing.JTextField();
        dobJTextField = new javax.swing.JTextField();
        phoneNumberJTextField = new javax.swing.JTextField();
        streetJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        stateJTextField = new javax.swing.JTextField();
        zipcodeJTextField = new javax.swing.JTextField();
        firstNameJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        policyIDJTextField = new javax.swing.JTextField();
        startDateJTextField = new javax.swing.JTextField();
        insuredAmountJTextField = new javax.swing.JTextField();
        policyNameJTextField = new javax.swing.JTextField();
        endDateJTextField = new javax.swing.JTextField();
        leftInsuredAmountJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel.setText("Manage Personel Details");
        add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 13, -1, -1));

        jLabel1.setText("Last Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 103, -1, -1));

        jLabel2.setText("SSN :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 148, -1, -1));

        jLabel3.setText("Date Of Birth");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 191, -1, -1));

        jLabel4.setText("Street :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 280, -1, -1));

        jLabel5.setText("City :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 280, -1, -1));

        jLabel6.setText("State :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 280, -1, -1));

        jLabel7.setText("Zipcode :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 280, -1, -1));

        jLabel8.setText("Phone Number :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 235, -1, -1));

        lastNameJTextField.setEditable(false);
        add(lastNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 100, 123, -1));

        ssnJTextField.setEditable(false);
        add(ssnJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 145, 123, -1));

        dobJTextField.setEditable(false);
        add(dobJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 188, 123, -1));

        phoneNumberJTextField.setEditable(false);
        add(phoneNumberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 232, 123, -1));

        streetJTextField.setEditable(false);
        add(streetJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 277, 198, -1));

        cityJTextField.setEditable(false);
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 277, 103, -1));

        stateJTextField.setEditable(false);
        add(stateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 277, 124, -1));

        zipcodeJTextField.setEditable(false);
        add(zipcodeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 277, 77, -1));

        firstNameJTextField.setEditable(false);
        add(firstNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 65, 123, -1));

        jLabel9.setText("First Name :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 68, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 21, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel10.setText("Insurance Details");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 351, -1, -1));

        jLabel11.setText("Policy ID :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 416, -1, -1));

        jLabel12.setText("Start Date: ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 461, -1, -1));

        jLabel13.setText("Policy Name :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 413, -1, -1));

        jLabel14.setText("End Date :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 458, -1, -1));

        jLabel15.setText("Insured Amount :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 513, -1, -1));
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 510, -1, -1));

        jLabel17.setText("Left Insured Amount :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 516, -1, -1));

        policyIDJTextField.setEditable(false);
        policyIDJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policyIDJTextFieldActionPerformed(evt);
            }
        });
        add(policyIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 413, 139, -1));

        startDateJTextField.setEditable(false);
        startDateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateJTextFieldActionPerformed(evt);
            }
        });
        add(startDateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 458, 139, -1));

        insuredAmountJTextField.setEditable(false);
        insuredAmountJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insuredAmountJTextFieldActionPerformed(evt);
            }
        });
        add(insuredAmountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 510, 139, -1));

        policyNameJTextField.setEditable(false);
        policyNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policyNameJTextFieldActionPerformed(evt);
            }
        });
        add(policyNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 413, 125, -1));

        endDateJTextField.setEditable(false);
        endDateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateJTextFieldActionPerformed(evt);
            }
        });
        add(endDateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 458, 125, -1));

        leftInsuredAmountJTextField.setEditable(false);
        leftInsuredAmountJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftInsuredAmountJTextFieldActionPerformed(evt);
            }
        });
        add(leftInsuredAmountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 510, 125, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void policyIDJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policyIDJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_policyIDJTextFieldActionPerformed

    private void startDateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateJTextFieldActionPerformed

    private void insuredAmountJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insuredAmountJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insuredAmountJTextFieldActionPerformed

    private void policyNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policyNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_policyNameJTextFieldActionPerformed

    private void endDateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateJTextFieldActionPerformed

    private void leftInsuredAmountJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftInsuredAmountJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftInsuredAmountJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JTextField dobJTextField;
    private javax.swing.JTextField endDateJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JTextField insuredAmountJTextField;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField leftInsuredAmountJTextField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JTextField policyIDJTextField;
    private javax.swing.JTextField policyNameJTextField;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JTextField startDateJTextField;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JTextField streetJTextField;
    private javax.swing.JTextField zipcodeJTextField;
    // End of variables declaration//GEN-END:variables
}
