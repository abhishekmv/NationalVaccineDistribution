/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.StateNetwork;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Abhishek
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }
    
    public void populateTree()
    {
        DefaultTreeModel model = (DefaultTreeModel) systemJTree.getModel();
        ArrayList<StateNetwork> networkList = system.getStateNetworkDirectory().getStateNetwork();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        StateNetwork sNetwork;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Network");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        systemJTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageStateNetworkJButton = new javax.swing.JButton();
        manageVaccineJButton = new javax.swing.JButton();
        manageDiseaseJButton = new javax.swing.JButton();
        manageProviderJButton = new javax.swing.JButton();
        manageOrderApprovalJButton = new javax.swing.JButton();
        manageInventoryJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedNodeJLabel = new javax.swing.JLabel();
        paymentJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ManageUserAccountJButton = new javax.swing.JButton();
        manageDistributorJButton = new javax.swing.JButton();
        manageManufacturerJButton = new javax.swing.JButton();
        managePersonsJButton = new javax.swing.JButton();
        btnManageEnterprises = new javax.swing.JButton();
        stateVaccineAllocationJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(250);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CDC");
        systemJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        systemJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                systemJTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(systemJTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageStateNetworkJButton.setText("Manage State Network");
        manageStateNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStateNetworkJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageStateNetworkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 119, 179, -1));

        manageVaccineJButton.setText("Manage Vaccine");
        manageVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageVaccineJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 249, 181, -1));

        manageDiseaseJButton.setText("Manage Disease");
        manageDiseaseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDiseaseJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageDiseaseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 206, 179, -1));

        manageProviderJButton.setText("Manage Provider");
        manageProviderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProviderJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageProviderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 461, 179, -1));

        manageOrderApprovalJButton.setText("Manage Order Approval");
        manageOrderApprovalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderApprovalJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageOrderApprovalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 559, 179, -1));

        manageInventoryJButton.setText("Manage State Inventory");
        manageInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageInventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 655, 179, -1));

        jLabel1.setText("Selected Node:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 66, -1, -1));

        selectedNodeJLabel.setText("<view_selected_node>");
        jPanel2.add(selectedNodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 66, -1, -1));

        paymentJButton.setText("Manage Payment");
        paymentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(paymentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 612, 181, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Center of Disease Control Work Area");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 26, 310, -1));

        ManageUserAccountJButton.setText("Manage User Account");
        ManageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageUserAccountJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ManageUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 504, 181, -1));

        manageDistributorJButton.setText("Manage Distributor");
        manageDistributorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDistributorJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageDistributorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 418, 181, -1));

        manageManufacturerJButton.setText("Manage Manufacturer");
        manageManufacturerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageManufacturerJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageManufacturerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 375, 181, -1));

        managePersonsJButton.setText("Manage Persons");
        managePersonsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonsJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(managePersonsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 292, 181, -1));

        btnManageEnterprises.setText("Manage Enterprises");
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEnterprises, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 335, 181, -1));

        stateVaccineAllocationJButton.setText("State Vaccine Allocation");
        stateVaccineAllocationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateVaccineAllocationJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(stateVaccineAllocationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 163, 179, -1));

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageStateNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStateNetworkJButtonActionPerformed
         ManageStateNetworkJPanel mnjp = new ManageStateNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageNetworkJPanel", mnjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageStateNetworkJButtonActionPerformed

    private void manageDiseaseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDiseaseJButtonActionPerformed
        // TODO add your handling code here:
        ManageDiseaseJPanel mdjp = new ManageDiseaseJPanel(userProcessContainer,system);
        userProcessContainer.add("ManageDiseaseJPanel", mdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDiseaseJButtonActionPerformed

    private void manageProviderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProviderJButtonActionPerformed

        ManageProviderJPanel mpjp = new ManageProviderJPanel(userProcessContainer, system);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageProviderJPanel", mpjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProviderJButtonActionPerformed

    private void systemJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_systemJTreeValueChanged
        // TODO add your handling code here:
          DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) systemJTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_systemJTreeValueChanged

    private void manageVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineJButtonActionPerformed
        // TODO add your handling code here:
        ManageVaccineJPanel manageVaccineJPanel = new ManageVaccineJPanel(userProcessContainer,system);
        userProcessContainer.add("manageVaccineJPanel", manageVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageVaccineJButtonActionPerformed

    private void manageOrderApprovalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderApprovalJButtonActionPerformed
        // TODO add your handling code here:
        
        ManageVaccineOrderJPanel mvojp = new ManageVaccineOrderJPanel(userProcessContainer,system,userAccount);
        userProcessContainer.add("ManageOrdersJPanel", mvojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageOrderApprovalJButtonActionPerformed

    private void manageInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryJButtonActionPerformed
        // TODO add your handling code here:
         ManageStateInventoryJPanel mijp = new ManageStateInventoryJPanel(userProcessContainer,system);
        userProcessContainer.add("ManageInventoryJPanel", mijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageInventoryJButtonActionPerformed

    private void ManageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
         ManageCDCUserAccountJPanel muajp = new ManageCDCUserAccountJPanel(userProcessContainer,system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_ManageUserAccountJButtonActionPerformed

    private void manageDistributorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDistributorJButtonActionPerformed
        // TODO add your handling code here:
       ManageDistributorJPanel mdjp = new ManageDistributorJPanel(userProcessContainer,system);
        userProcessContainer.add("ManageUserAccountJPanel", mdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageDistributorJButtonActionPerformed

    private void manageManufacturerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageManufacturerJButtonActionPerformed
        // TODO add your handling code here:
        ManageManufacturersJPanel mmjp = new ManageManufacturersJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageManufacturersJPanel", mmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageManufacturerJButtonActionPerformed

    private void managePersonsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonsJButtonActionPerformed
        // TODO add your handling code here:
        ManageCDCPersonJPanel mpjp = new ManageCDCPersonJPanel(userProcessContainer, system);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManagePersonJPanel", mpjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonsJButtonActionPerformed

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel mep = new ManageEnterpriseJPanel(userProcessContainer, system);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageEnterpriseJPanel", mep);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterprisesActionPerformed

    private void stateVaccineAllocationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateVaccineAllocationJButtonActionPerformed
        // TODO add your handling code here:
        StateVaccineAllocationJPanel svajp = new StateVaccineAllocationJPanel(userProcessContainer, system);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StateVaccineAllocationJPanel", svajp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_stateVaccineAllocationJButtonActionPerformed

    private void paymentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentJButtonActionPerformed
        // TODO add your handling code here:
        ManageCDCPaymentAccountJPanel mcdcpajp = new ManageCDCPaymentAccountJPanel(userProcessContainer, system,userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageCDCPaymentAccountJPanel", mcdcpajp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_paymentJButtonActionPerformed

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageUserAccountJButton;
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageDiseaseJButton;
    private javax.swing.JButton manageDistributorJButton;
    private javax.swing.JButton manageInventoryJButton;
    private javax.swing.JButton manageManufacturerJButton;
    private javax.swing.JButton manageOrderApprovalJButton;
    private javax.swing.JButton managePersonsJButton;
    private javax.swing.JButton manageProviderJButton;
    private javax.swing.JButton manageStateNetworkJButton;
    private javax.swing.JButton manageVaccineJButton;
    private javax.swing.JButton paymentJButton;
    private javax.swing.JLabel selectedNodeJLabel;
    private javax.swing.JButton stateVaccineAllocationJButton;
    private javax.swing.JTree systemJTree;
    // End of variables declaration//GEN-END:variables
}
