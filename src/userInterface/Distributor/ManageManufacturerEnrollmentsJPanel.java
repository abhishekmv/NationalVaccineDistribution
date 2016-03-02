/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Distributor;

import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.ManufacturerEnterprise;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageManufacturerEnrollmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageManufacturerEnrollmentsJPanel
     */
    private JPanel userProcessContainer;
    private DistributorEnterprise distributorEnterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    
    public ManageManufacturerEnrollmentsJPanel(JPanel userProcessContainer,EcoSystem system,DistributorEnterprise distributorEnterprise,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.distributorEnterprise = distributorEnterprise;
        this.userAccount = userAccount;
        this.system = system;
        populateManufacturerEnrollment();
    }
    
     private void populateManufacturerEnrollment() {
      
         DefaultTableModel model = (DefaultTableModel) manageEnrollmentJTable.getModel();
         model.setRowCount(0);
         
         for(WorkRequest wr : distributorEnterprise.getWorkQueue().getWorkRequestList())
         {
             if(wr.getSender().getRole().getRoleName().equals(Role.RoleType.ManufacuturerAdminRole.getValue()))
             {
                 Object [] row = new Object[4];
                 row[0] = wr.getSender().getPerson().getFirstName()+" "+wr.getSender().getPerson().getLastName();
                 row[2] = wr;
                   row[3] = wr.getRequestDate();
         for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList())
         {
             if(e instanceof ManufacturerEnterprise)
             {
                 ManufacturerEnterprise me = (ManufacturerEnterprise)e;
                 for(UserAccount ua : me.getUserAccountDirectory().getUserAccountList())
                 {
                     if(ua.equals(wr.getSender()))
                     {
                            row[1] = me.getName();
                            model.addRow(row);
                            break;
                     }
                 
                 }
                 
             
             }
         }
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
        manageEnrollmentJTable = new javax.swing.JTable();
        btnEnroll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cancelJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manufacturer Enrollments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 61, -1, -1));

        manageEnrollmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Manufacturer ", "Admin", "Status", "Requested Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageEnrollmentJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 117, 601, 97));

        btnEnroll.setText("Approve Enrollment");
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });
        add(btnEnroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 237, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 61, -1, -1));

        cancelJButton.setText("Cancel Enrollment");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });
        add(cancelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 237, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
       
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        // TODO add your handling code here:
        int rowSelected  = manageEnrollmentJTable.getSelectedRow();
        
        if(rowSelected<0)
         {
             JOptionPane.showMessageDialog(null, "No row selected!");
             return;
         
         }
        WorkRequest req = (WorkRequest)manageEnrollmentJTable.getValueAt(rowSelected, 2);
            req.setStatus("Approved!");
            req.setMessage("Approved!");
            req.setReceiver(userAccount);
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof ManufacturerEnterprise){
                        ManufacturerEnterprise me = (ManufacturerEnterprise)e;
                        for(UserAccount ua : me.getUserAccountDirectory().getUserAccountList()){
                            if(ua.equals(req.getSender())){
                              me.setIsEnrolled("YES");
                            }
                        }
                        
                    }
            
                
        }
        populateManufacturerEnrollment();
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:
         int rowSelected  = manageEnrollmentJTable.getSelectedRow();
        
        if(rowSelected<0)
         {
             JOptionPane.showMessageDialog(null, "No row selected!");
             return;
         
         }
       WorkRequest req = (WorkRequest)manageEnrollmentJTable.getValueAt(rowSelected, 2);
            req.setStatus("Declined!");
            req.setMessage("Declined!");
            req.setReceiver(userAccount);
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof ManufacturerEnterprise){
                        ManufacturerEnterprise me = (ManufacturerEnterprise)e;
                        for(UserAccount ua : me.getUserAccountDirectory().getUserAccountList()){
                            if(ua.equals(req.getSender())){
                              me.setIsEnrolled("NO");
                            }
                        }
                        
                    }
            
                
        }
        
        populateManufacturerEnrollment();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageEnrollmentJTable;
    // End of variables declaration//GEN-END:variables

   
}
