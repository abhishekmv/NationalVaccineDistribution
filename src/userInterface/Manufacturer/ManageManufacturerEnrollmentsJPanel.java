/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Manufacturer;

import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.ManufacturerEnterprise;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.WorkQueue.ManufacturerEnrollmentWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ManageManufacturerEnrollmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageManufacturerEnrollmentsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private ManufacturerEnterprise manufacturerEnterprise;
    private UserAccount userAccount;
    public ManageManufacturerEnrollmentsJPanel(JPanel userProcessContainer,EcoSystem system,ManufacturerEnterprise manufacturerEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.manufacturerEnterprise = manufacturerEnterprise;
        
        for(UserAccount u : manufacturerEnterprise.getUserAccountDirectory().getUserAccountList())
        {
        
            if(u.getRole().getRoleName().equals(Role.RoleType.ManufacuturerAdminRole.getValue()))
            {
                this.userAccount = u; 
            }
        }
        populateText();
        
    }
    
    
    private void populateText()
    {
        txtStatus.setText("Not Enrolled");
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
        
            if(request.getMessage().equals("Approved!"))
            {
            
                admintxt.setText(request.getReceiver().getPerson().getFirstName()+" "+request.getReceiver().getPerson().getLastName());
                txtStatus.setText("Enrolled");
                for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList())
                {
                    if(e instanceof DistributorEnterprise)
                    {
                        distributorJTextField.setText(e.getName());
                    }
                
                }
            }
            else if(request.getMessage().equals("Declined!"))
            {
                txtStatus.setText("Declined!");
            
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admintxt = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnEnroll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        distributorJTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Manufacturer Enrollments");

        jLabel3.setText("Admin");

        jLabel4.setText("Enrollment Status");

        admintxt.setEditable(false);

        txtStatus.setEditable(false);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        btnEnroll.setText("Raise an Enrollment Request!");
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Distributor");

        distributorJTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStatus)
                                    .addComponent(admintxt)
                                    .addComponent(distributorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(admintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(distributorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnEnroll)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        // TODO add your handling code here:
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList())
        {
        
            if(e instanceof DistributorEnterprise)
            {
                Calendar cal = Calendar.getInstance();
                ManufacturerEnrollmentWorkRequest enrollment = new ManufacturerEnrollmentWorkRequest();
                enrollment.setSender(userAccount);
                enrollment.setMessage("Distributor Approval Pending");
                enrollment.setRequestDate(cal.getTime());
                enrollment.setStatus("Pending");
                userAccount.getWorkQueue().getWorkRequestList().add(enrollment);
                e.getWorkQueue().getWorkRequestList().add(enrollment);
            }
        
        }
            
            JOptionPane.showMessageDialog(null, "Enrollment request raised");
        }
        else if(!userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
            for(WorkRequest r : userAccount.getWorkQueue().getWorkRequestList())
            {
                if(r.getMessage().equals("Distributor Approval Pending"))
                {
                    JOptionPane.showMessageDialog(null,"Your request is pending at distributor" );
                
                }
                else if(r.getMessage().equals("Approved!"))
                {
                    JOptionPane.showMessageDialog(null, "You are already enrolled with distributor");
                
                }
                else if(r.getStatus().equals("Declined!"))
                {
                
                        r.setMessage("Distributor Approval Pending");
                        r.setStatus("Pending");
                        r.setRequestDate(null);
                        JOptionPane.showMessageDialog(null, "Enrollment request raised");
                }
            
            }
        
        }
        
        
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
       
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admintxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JTextField distributorJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
