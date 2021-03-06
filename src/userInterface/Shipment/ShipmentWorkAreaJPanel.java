/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Shipment;

import business.Enterprise.DistributorEnterprise;
import business.Order.OrderItem;
import business.Organization.ShippingOrganization;
import business.UserAccount.UserAccount;
import business.Vaccine.Batch;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ShipmentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShipmentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DistributorEnterprise distributorEnterprise;
    private ShippingOrganization shippingOrganization;
    private UserAccount userAccount;
    
    
    public ShipmentWorkAreaJPanel(JPanel userProcessContainer,DistributorEnterprise distributorEnterprise,ShippingOrganization shippingOrganization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.distributorEnterprise = distributorEnterprise;
        this.shippingOrganization = shippingOrganization;
        this.userAccount = userAccount;
        enterpriseTypeJTextField.setText(distributorEnterprise.getName());
        shippingDetailsJLayeredPane.setVisible(false);
        populateNewRequestTable();
        populateProcessRequestTable();
    }
    
    private  void populateNewRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel) shippingJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest wr : shippingOrganization.getWorkQueue().getWorkRequestList())
        {
            if(!wr.getStatus().equals("Order Approved And Shipped"))
            {
            Object [] row = new Object[3];
            row[0] = wr.getOrder().getOrderNumber();
            row[1] = wr.getRequestDate();
            row[2] = wr;
            model.addRow(row);
            }
        }
    
    
    }
    
    private void populateProcessRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel) shippingJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest wr : shippingOrganization.getWorkQueue().getWorkRequestList())
        {
            if(!wr.getStatus().equals("Order Approved And Shipped"))
            {
            Object [] row = new Object[4];
            row[0] = wr.getOrder().getOrderNumber();
            row[1] = wr.getRequestDate();
            row[2] = wr.getResolveDate() == null ? null : wr.getResolveDate();
            row[3] = wr;
            model.addRow(row);
            }
        }
    
    
    
    }
    
    private void populateTextFieldAndTable(WorkRequest request)
    {
        orderIDJTextField.setText(request.getOrder().getOrderNumber());
        destinationJTextField.setText(request.getOrder().getSite().getCityName());
        siteJTextField.setText(request.getOrder().getSite().getName());
        requestedDateJTextField.setText(String.valueOf(request.getRequestDate()));
        
          DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        
        for(OrderItem oi : request.getOrder().getOrderItemList())
        {
            for(Batch b : oi.getBatchList())
            {
                Object[] row = new Object[3];
                
                row[0] = oi.getVaccineType().getVaccineTypeName();
                row[1] = oi.getVaccine().getVaccineName();
                row[2] = b.getBatchID();
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
        shippingJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        enterpriseTypeJTextField = new javax.swing.JTextField();
        viewOrderJButton = new javax.swing.JButton();
        shippingDetailsJLayeredPane = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        orderIDJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        requestedDateJTextField = new javax.swing.JTextField();
        destinationJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        siteJTextField = new javax.swing.JTextField();
        btnProcessReq = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProcessedRequests = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel1.setText("Shipment Work Area");

        shippingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderID", "Request Date", "Resolved Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shippingJTable);

        jLabel2.setText("Enterprise - ");

        enterpriseTypeJTextField.setEditable(false);

        viewOrderJButton.setText("View Order Details");
        viewOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderJButtonActionPerformed(evt);
            }
        });

        shippingDetailsJLayeredPane.setBorder(new javax.swing.border.MatteBorder(null));
        shippingDetailsJLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine Type", "Vaccine Name", "Batch Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderJTable);

        shippingDetailsJLayeredPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 165, -1, 150));

        jLabel3.setText("OrderID :");
        shippingDetailsJLayeredPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 55, 60, 30));

        orderIDJTextField.setEditable(false);
        shippingDetailsJLayeredPane.add(orderIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 60, 130, 20));

        jLabel4.setText("Requested Date :");
        shippingDetailsJLayeredPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 60, 100, 20));

        jLabel5.setText("Destination :");
        shippingDetailsJLayeredPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, -1, -1));

        requestedDateJTextField.setEditable(false);
        requestedDateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestedDateJTextFieldActionPerformed(evt);
            }
        });
        shippingDetailsJLayeredPane.add(requestedDateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 59, 130, -1));

        destinationJTextField.setEditable(false);
        shippingDetailsJLayeredPane.add(destinationJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 111, 130, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Shipping Details");
        shippingDetailsJLayeredPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 140, 30));

        jLabel6.setText("Site :");
        shippingDetailsJLayeredPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 114, -1, -1));

        siteJTextField.setEditable(false);
        siteJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteJTextFieldActionPerformed(evt);
            }
        });
        shippingDetailsJLayeredPane.add(siteJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 111, 130, -1));

        btnProcessReq.setText("Process Request");
        btnProcessReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessReqActionPerformed(evt);
            }
        });

        jLabel8.setText("Processed requests");

        tblProcessedRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Request Date", "Resolve Date", "Status"
            }
        ));
        jScrollPane3.setViewportView(tblProcessedRequests);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(enterpriseTypeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel1))
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(viewOrderJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(shippingDetailsJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnProcessReq)))
                .addContainerGap(520, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(enterpriseTypeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnProcessReq)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewOrderJButton)
                .addGap(29, 29, 29)
                .addComponent(shippingDetailsJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestedDateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestedDateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestedDateJTextFieldActionPerformed

    private void viewOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderJButtonActionPerformed
        // TODO add your handling code here:
        
        
        int rowSelected = tblProcessedRequests.getSelectedRow();
        if(rowSelected<0)
        {
            
            JOptionPane.showMessageDialog(null, "No row has been selected!");
            return;
        
        }
        
        shippingDetailsJLayeredPane.setVisible(true);
        WorkRequest request = (WorkRequest) tblProcessedRequests.getValueAt(rowSelected, 3);
        populateTextFieldAndTable(request);
        
        
    }//GEN-LAST:event_viewOrderJButtonActionPerformed

    private void btnProcessReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessReqActionPerformed
        // TODO add your handling code here:
        
        int rowSelected = shippingJTable.getSelectedRow();
        if(rowSelected<0)
        {
            JOptionPane.showMessageDialog(null, "No row has been selected!");
            return;
        
        }
        
        
        WorkRequest request = (WorkRequest) shippingJTable.getValueAt(rowSelected, 3);
        request.setReceiver(userAccount);
        request.setStatus("Order Approved And Shipped");
        request.getOrder().setStatus("Order Approved And Shipped");
        Calendar cal = Calendar.getInstance();
        request.setResolveDate(cal.getTime());
        
        for(OrderItem oi : request.getOrder().getOrderItemList())
        {
        
            if(!oi.getBatchList().isEmpty())
            {
                for(Batch b : oi.getBatchList())
                {
                    request.getOrder().getSite().getBatchDirectory().getBatchList().add(b);
                
                }
            
            
            }
        
        }
        
        
        populateNewRequestTable();
        populateProcessRequestTable();
        
        
    }//GEN-LAST:event_btnProcessReqActionPerformed

    private void siteJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessReq;
    private javax.swing.JTextField destinationJTextField;
    private javax.swing.JTextField enterpriseTypeJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderIDJTextField;
    private javax.swing.JTable orderJTable;
    private javax.swing.JTextField requestedDateJTextField;
    private javax.swing.JLayeredPane shippingDetailsJLayeredPane;
    private javax.swing.JTable shippingJTable;
    private javax.swing.JTextField siteJTextField;
    private javax.swing.JTable tblProcessedRequests;
    private javax.swing.JButton viewOrderJButton;
    // End of variables declaration//GEN-END:variables
}
