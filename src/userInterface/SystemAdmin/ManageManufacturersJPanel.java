/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.ManufacturerEnterprise;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.Vaccine.Batch;
import business.Vaccine.Vaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageManufacturersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageManufacturersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private EnterpriseDirectory enterpriseDirectory;
    public ManageManufacturersJPanel(JPanel userProcessContainer,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        enterpriseDirectory = ecoSystem.getEnterpriseDirectory();
        populationManufacturer();
    }

    
    private void populationManufacturer()
    {
    
        DefaultTableModel model = (DefaultTableModel) manuNameJTable.getModel();
        model.setRowCount(0);
        
        for(Enterprise e : enterpriseDirectory.getEnterpriseList())
        {
            
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Manufacturer))
            {
            
                Object[] row = new Object[1];
                  row[0] = e;
                  model.addRow(row);
            
            }
                    
        }
    
    }
    
    private void populateProducedVaccineTable(Enterprise e)
    {
    
        DefaultTableModel model = (DefaultTableModel) producedVaccineJTable.getModel();
        model.setRowCount(0);
    
        for(Batch b : e.getBatchDirectory().getBatchList())
        {
            if(!b.getVaccineList().isEmpty())
            {
                for(Vaccine vacc : b.getVaccineList())
                {
                
                    Object [] row = new Object[4];
                    row[0] = vacc.getVaccineType().getVaccineTypeName();
                    row[1] = vacc.getVaccineName();
                    row[2] = vacc.getVaccineBatchNo();
                    row[3] = vacc.getVaccineType().getFundingInfo();
                    model.addRow(row);
                break;
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

        txtStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manuNameJTable = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        viewInventoryJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bckJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        producedVaccineJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        txtStatus.setEditable(false);

        jLabel4.setText("Status");

        manuNameJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manuNameJTable);

        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        viewInventoryJButton.setText("View Current Inventory");
        viewInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Vaccines Produced");

        bckJButton.setText("<< Back");
        bckJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckJButtonActionPerformed(evt);
            }
        });

        producedVaccineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine Type", "Vaccine Name", "Batch Number", "Funding Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(producedVaccineJTable);

        jLabel2.setText("Admin Name");

        txtName.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Manufacturers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bckJButton)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewDetailsJButton)
                                .addGap(114, 114, 114)
                                .addComponent(viewInventoryJButton)))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bckJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewDetailsJButton)
                    .addComponent(viewInventoryJButton))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bckJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bckJButtonActionPerformed

    private void viewInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryJButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = manuNameJTable.getSelectedRow();
        
        if(rowSelected<0)
        {
            JOptionPane.showMessageDialog(null, "No row selected");
            return;
        }
        ManufacturerEnterprise me = (ManufacturerEnterprise) manuNameJTable.getValueAt(rowSelected, 0);
        
        if(me.getBatchDirectory().getBatchList().isEmpty())
        {
            
            JOptionPane.showMessageDialog(null, "The inventory is empty for the selected manufacturer!");
            return;
        }
        
          ViewManufacturerInventoryJPanel vmijp = new ViewManufacturerInventoryJPanel(userProcessContainer,me);
         userProcessContainer.add("ViewManufacturerInventoryJPanel", vmijp);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);
         
        
    }//GEN-LAST:event_viewInventoryJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = manuNameJTable.getSelectedRow();
        
        if(rowSelected<0)
        {
            JOptionPane.showMessageDialog(null, "No row selected");
            return;
        }
        ManufacturerEnterprise me = (ManufacturerEnterprise) manuNameJTable.getValueAt(rowSelected, 0);
        
        for(Enterprise e : enterpriseDirectory.getEnterpriseList())
        {
        
            if(e.getName().equals(me.getName()) && e.getEnterpriseType().equals(me.getEnterpriseType()) && (!e.getUserAccountDirectory().getUserAccountList().isEmpty()))
            {
            
                for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                {
                
                    if(ua.getRole().getRoleName().equals(Role.RoleType.ManufacuturerAdminRole.getValue()))
                    {
                    
                        txtName.setText(ua.getPerson().getFirstName()+" "+ua.getPerson().getLastName());
                        txtStatus.setText(ua.getStatus());
                    
                    }
                
                }
                
                populateProducedVaccineTable(e);
            
            }
        
        }
        
        
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable manuNameJTable;
    private javax.swing.JTable producedVaccineJTable;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JButton viewInventoryJButton;
    // End of variables declaration//GEN-END:variables
}
