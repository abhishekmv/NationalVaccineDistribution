/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PHD;

import business.EcoSystem;
import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.PHDEnterprise;
import business.Network.StateNetwork;
import business.Person.PersonDirectory;
import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import business.Vaccine.BatchDirectory;
import business.Vaccine.VaccineTypeDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class StatePHDWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StatePHDWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private PHDEnterprise pHDEnterprise; 
    private PersonDirectory personDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccountDirectory userAccountDirectory;
    private VaccineTypeDirectory vaccineTypeDirectory;
    private BatchDirectory batchDirectory;
    private StateNetwork stateNetwork;
    private UserAccount userAccount;
    
    public StatePHDWorkAreaJPanel(JPanel userProcessContainer,PHDEnterprise pHDEnterprise,EcoSystem ecoSystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        
        this.pHDEnterprise = (PHDEnterprise) pHDEnterprise;
        this.personDirectory = pHDEnterprise.getPersonDirectory();
        this.enterpriseDirectory = pHDEnterprise.getEnterpriseDirectory();
        this.userAccountDirectory = pHDEnterprise.getUserAccountDirectory();
        this.ecoSystem = ecoSystem;
        this.vaccineTypeDirectory = ecoSystem.getVaccineDirectory();
        
        for(StateNetwork sn : ecoSystem.getStateNetworkDirectory().getStateNetwork()){
            if(sn.getState().getStatePHD().equals(pHDEnterprise)){
                stateNetwork = sn;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StateJTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageInventoryJButton = new javax.swing.JButton();
        managePaymentJButton = new javax.swing.JButton();
        manageSitesButton = new javax.swing.JButton();
        manageFundedVaccineJButton = new javax.swing.JButton();
        manageProviderJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageUserAccountJButton = new javax.swing.JButton();
        manageOrderJButton = new javax.swing.JButton();
        btnManageCityNetwork = new javax.swing.JButton();
        btnManagePersons = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(234);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("StatePHD");
        StateJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(StateJTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        manageInventoryJButton.setText("Manage Inventory");
        manageInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryJButtonActionPerformed(evt);
            }
        });

        managePaymentJButton.setText("Manage Payment");
        managePaymentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePaymentJButtonActionPerformed(evt);
            }
        });

        manageSitesButton.setText("Manage Sites");
        manageSitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSitesButtonActionPerformed(evt);
            }
        });

        manageFundedVaccineJButton.setText("Manage Funded Vaccine");
        manageFundedVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFundedVaccineJButtonActionPerformed(evt);
            }
        });

        manageProviderJButton.setText("Manage Provider");
        manageProviderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProviderJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("State PHD Work Area ");

        manageUserAccountJButton.setText("Manage User Account");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });

        manageOrderJButton.setText("Manage Order");
        manageOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderJButtonActionPerformed(evt);
            }
        });

        btnManageCityNetwork.setText("Manage City Network");
        btnManageCityNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCityNetworkActionPerformed(evt);
            }
        });

        btnManagePersons.setText("Manage Persons");
        btnManagePersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageProviderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnManageCityNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageFundedVaccineJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageSitesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnManagePersons, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageUserAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(managePaymentJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(manageInventoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(238, 238, 238))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(manageProviderJButton)
                .addGap(18, 18, 18)
                .addComponent(btnManageCityNetwork)
                .addGap(20, 20, 20)
                .addComponent(manageFundedVaccineJButton)
                .addGap(18, 18, 18)
                .addComponent(manageSitesButton)
                .addGap(27, 27, 27)
                .addComponent(btnManagePersons)
                .addGap(18, 18, 18)
                .addComponent(manageUserAccountJButton)
                .addGap(18, 18, 18)
                .addComponent(managePaymentJButton)
                .addGap(34, 34, 34)
                .addComponent(manageOrderJButton)
                .addGap(29, 29, 29)
                .addComponent(manageInventoryJButton)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCityNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCityNetworkActionPerformed
        // TODO add your handling code here:

        ManageCityNetworkJPanel mcnjp = new ManageCityNetworkJPanel(userProcessContainer, stateNetwork);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageCityNetworkJPanel", mcnjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCityNetworkActionPerformed

    private void manageProviderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProviderJButtonActionPerformed
        // TODO add your handling code here:
         ManageProviderJPanel mpjp = new ManageProviderJPanel(userProcessContainer, pHDEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageStateProviderPanel", mpjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProviderJButtonActionPerformed

    private void btnManagePersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonsActionPerformed
        // TODO add your handling code here:

        ManagePHDPersonJPanel mpjp = new ManagePHDPersonJPanel(userProcessContainer, personDirectory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManagePersonJPanel", mpjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePersonsActionPerformed

    private void manageFundedVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFundedVaccineJButtonActionPerformed
        // TODO add your handling code here:
        ManageStateFundedVaccineJPanel msfvjp = new ManageStateFundedVaccineJPanel(userProcessContainer, vaccineTypeDirectory,pHDEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageStateFundedVaccinesPanel", msfvjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageFundedVaccineJButtonActionPerformed

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
          ManagePHDUserAccountJPanel muajp = new ManagePHDUserAccountJPanel(userProcessContainer, userAccountDirectory,enterpriseDirectory,personDirectory,pHDEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageSitesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSitesButtonActionPerformed
        // TODO add your handling code here:
        ManageSiteJPanel msjp = new ManageSiteJPanel(userProcessContainer,stateNetwork);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageSiteJPanel", msjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageSitesButtonActionPerformed

    private void manageOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderJButtonActionPerformed
        // TODO add your handling code here:
         ManageStateOrdersPanel msop = new ManageStateOrdersPanel(userProcessContainer,ecoSystem,pHDEnterprise,userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageStateOrdersPanel", msop);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageOrderJButtonActionPerformed

    private void managePaymentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePaymentJButtonActionPerformed
        // TODO add your handling code here:
        
        ManagePHDPaymentAccountJPanel mphdpajp = new ManagePHDPaymentAccountJPanel(userProcessContainer,ecoSystem,userAccount,pHDEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManagePHDPaymentAccountJPanel", mphdpajp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePaymentJButtonActionPerformed

    private void manageInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryJButtonActionPerformed
        // TODO add your handling code here:
        ManageStateInventoryJPanel msijp = new ManageStateInventoryJPanel(userProcessContainer,pHDEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageStateInventoryJPanel", msijp);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageInventoryJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree StateJTree;
    private javax.swing.JButton btnManageCityNetwork;
    private javax.swing.JButton btnManagePersons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageFundedVaccineJButton;
    private javax.swing.JButton manageInventoryJButton;
    private javax.swing.JButton manageOrderJButton;
    private javax.swing.JButton managePaymentJButton;
    private javax.swing.JButton manageProviderJButton;
    private javax.swing.JButton manageSitesButton;
    private javax.swing.JButton manageUserAccountJButton;
    // End of variables declaration//GEN-END:variables
}
