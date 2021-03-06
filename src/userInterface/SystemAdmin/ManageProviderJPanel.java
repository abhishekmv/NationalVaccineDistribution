/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.PHDEnterprise;
import business.Enterprise.ProviderEnterprise;
import business.Enterprise.SiteEnterprise;
import business.Network.StateNetwork;
import business.Network.StateNetworkDirectory;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.omg.CORBA.OBJECT_NOT_EXIST;

/**
 *
 * @author Abhishek
 */
public class ManageProviderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProviderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private StateNetworkDirectory stateNetworkDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    
    public ManageProviderJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.stateNetworkDirectory = system.getStateNetworkDirectory();
        this.enterpriseDirectory = system.getEnterpriseDirectory();
        populateProviderTable();
    }

    
    private void populateProviderTable()
    {
         DefaultTableModel model = (DefaultTableModel) providerJTable.getModel();
         model.setRowCount(0);
         
         
        for(StateNetwork sn : stateNetworkDirectory.getStateNetwork()){
            
            PHDEnterprise ent = sn.getState().getStatePHD();
            
                for(Enterprise p : ent.getEnterpriseDirectory().getEnterpriseList()){
                    if(p instanceof ProviderEnterprise){
                        Object[] row = new Object[2];
                        row[0] = p.getOrganizationID();
                        row[1] = p;
                        model.addRow(row);
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

        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewJButton = new javax.swing.JButton();
        txtAdminName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        providerJTable = new javax.swing.JTable();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Status");

        txtStatus.setEnabled(false);

        jLabel6.setText("State");

        txtState.setEnabled(false);

        jLabel2.setText("Admin");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Providers");

        viewJButton.setText("View Details");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        txtAdminName.setEnabled(false);

        providerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(providerJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(backJButton)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdminName)
                                    .addComponent(txtStatus)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(viewJButton)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = providerJTable.getSelectedRow();
        
        if(rowSelected<0)
        {
             JOptionPane.showMessageDialog(null, "No row is selected");
            return;
        
        }
        
        ProviderEnterprise providerEnterprise =(ProviderEnterprise) providerJTable.getValueAt(rowSelected, 1);
        
        for(UserAccount ua : providerEnterprise.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getRole().getRoleName().equals(Role.RoleType.ProviderRole.getValue()))
            {
            
                txtAdminName.setText(ua.getPerson().getFirstName()+" "+ua.getPerson().getLastName());
                txtStatus.setText(ua.getStatus());
                txtState.setText(providerEnterprise.getStateName());
            
            }
        
        
        }
        
        
    }//GEN-LAST:event_viewJButtonActionPerformed

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable providerJTable;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
