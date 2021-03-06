/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Distributor;


import business.Distributor.Warehouse;
import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.ManufacturerEnterprise;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.Sites.ManageSiteOrdersJPanel;

/**
 *
 * @author Abhishek
 */
public class ManageManufacturerSelectionJPanel extends javax.swing.JPanel {
    
    private JPanel upc;
    private UserAccount userAccount;
    private DistributorEnterprise distributorEnterprise;
    private EcoSystem system;

    /**
     * Creates new form ManufacturerSelectionPanel
     */
    public ManageManufacturerSelectionJPanel(JPanel upc,UserAccount userAccount,DistributorEnterprise distributorEnterprise,EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.userAccount = userAccount;
        this.distributorEnterprise = distributorEnterprise;
        this.system = system;
        populateManufacturerCombo();
        populateWarehouseCombo();
        viewOrderJLayeredPane.setVisible(false);
        populateOrderHistoryTable();
    }
    
    public void populateManufacturerCombo(){
        comboManufacturer.removeAllItems();
        
        
        
        if(!system.getEnterpriseDirectory().getEnterpriseList().isEmpty()){
            
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof ManufacturerEnterprise){
                    ManufacturerEnterprise m = (ManufacturerEnterprise) e;
                    if(m.getIsEnrolled().equals("YES")){
                        comboManufacturer.addItem(m);
                    }
                }
            }
        }
    }
    public void populateWarehouseCombo()
    {
                regionJComboBox.removeAllItems();
                
                if(!distributorEnterprise.getWarehouseList().isEmpty())
                {
                    for(Warehouse w : distributorEnterprise.getWarehouseList())
                    {
                        regionJComboBox.addItem(w);
                    
                    }
                
                }
 
    }
    
    private void populateOrderHistoryTable()
    {
        
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(request.getSender().equals(userAccount))
            {
            
                if(request.getOrder()!=null)
                {
                    if(request.getOrder().getSite()==null)
                    {
                        Object [] row = new Object[5];
                        row[0] = request.getOrder().getOrderNumber();
                        row[1] = request.getWarehouse().getWarehouseRegion();
                        row[2] = request.getOrder().getBillAmount();
                        row[3] = request.getStatus();
                        row[4] = request.getRequestDate();
                        model.addRow(row);
                        
                    
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

        btnBack = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnManageSiteOrders = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnViewOrderHist = new javax.swing.JButton();
        regionJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        regionJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        comboManufacturer = new javax.swing.JComboBox();
        btnProceed = new javax.swing.JButton();
        viewOrderJLayeredPane = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        doneJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageSiteOrders.setText("Manage Site Orders");
        btnManageSiteOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSiteOrdersActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnManageSiteOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 170, -1));

        jLabel2.setText("Select a Manufacturer :");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnViewOrderHist.setText("View Order History");
        btnViewOrderHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderHistActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnViewOrderHist, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, -1));

        regionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionJTextFieldActionPerformed(evt);
            }
        });
        jLayeredPane1.add(regionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 170, -1));

        jLabel3.setText("Region :");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        regionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        regionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionJComboBoxActionPerformed(evt);
            }
        });
        jLayeredPane1.add(regionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Vaccine Ordering");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        comboManufacturer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(comboManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 170, -1));

        btnProceed.setText("Proceed to Order");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 170, -1));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 417, 330));

        viewOrderJLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        viewOrderJLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("View Order History");
        viewOrderJLayeredPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 15, -1, -1));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Warehouse", "Price", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        viewOrderJLayeredPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 68, 649, 352));

        doneJButton.setText("Done!");
        doneJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneJButtonActionPerformed(evt);
            }
        });
        viewOrderJLayeredPane.add(doneJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        add(viewOrderJLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 780, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        
        ManufacturerEnterprise m = (ManufacturerEnterprise)comboManufacturer.getSelectedItem();
        Warehouse w = (Warehouse) regionJComboBox.getSelectedItem();
        
        if(m!=null){
            if(w!=null)
            {
            ManageOrderVaccinesJPanel movjp = new ManageOrderVaccinesJPanel(upc,userAccount, distributorEnterprise,system,m,w);
            upc.add("ManageOrderVaccinesJPanel",movjp);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No warehouse added!");
            
            }
        }
        else
            {
                JOptionPane.showMessageDialog(null, "No approved manufactured");
            
            }
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) upc.getLayout();
        upc.remove(this);
        layout.previous(upc);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageSiteOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSiteOrdersActionPerformed
        // TODO add your handling code here:
          ManageSiteOrderJPanel msojp = new ManageSiteOrderJPanel(upc,distributorEnterprise,userAccount,system);
         upc.add("ManageSiteOrderJPanel",msojp);
         CardLayout layout = (CardLayout) upc.getLayout();
         layout.next(upc);
    }//GEN-LAST:event_btnManageSiteOrdersActionPerformed

    private void regionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionJTextFieldActionPerformed

    private void regionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionJComboBoxActionPerformed
        // TODO add your handling code here:
        Warehouse w = (Warehouse) regionJComboBox.getSelectedItem();
        
        if(w!=null){
            regionJTextField.setText(w.getWarehouseRegion());
        }
        
        
    }//GEN-LAST:event_regionJComboBoxActionPerformed

    private void btnViewOrderHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderHistActionPerformed
        // TODO add your handling code here:
         viewOrderJLayeredPane.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnViewOrderHistActionPerformed

    private void doneJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneJButtonActionPerformed
        // TODO add your handling code here:
        viewOrderJLayeredPane.setVisible(false);
    }//GEN-LAST:event_doneJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageSiteOrders;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnViewOrderHist;
    private javax.swing.JComboBox comboManufacturer;
    private javax.swing.JButton doneJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderJTable;
    private javax.swing.JComboBox regionJComboBox;
    private javax.swing.JTextField regionJTextField;
    private javax.swing.JLayeredPane viewOrderJLayeredPane;
    // End of variables declaration//GEN-END:variables
}
