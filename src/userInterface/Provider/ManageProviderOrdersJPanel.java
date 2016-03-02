/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Provider;


import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.PHDEnterprise;
import business.Enterprise.ProviderEnterprise;
import business.Order.OrderItem;
import business.UserAccount.UserAccount;
import business.Vaccine.VaccineType;
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
public class ManageProviderOrdersJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private ProviderEnterprise providerEnterprise;
    private UserAccount userAccount;
    private EcoSystem system;

    /**
     * Creates new form ManageOrdersPanel
     */
    public ManageProviderOrdersJPanel(JPanel userProcessContainer,ProviderEnterprise providerEnterprise,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.providerEnterprise = providerEnterprise;
        this.userAccount = userAccount;
        this.system = system;
        populateTable();
    }
    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblOrders.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest req : providerEnterprise.getWorkQueue().getWorkRequestList()){
            if(!req.getOrder().getOrderItemList().isEmpty()){
                Object[] row = new Object[6];
                row[0] = req.getOrder().getOrderNumber();
                row[1] = req.getRequestDate();
                row[2] = req.getOrder().getSite();
                row[3] = req;
                row[4] = req.getOrder().getStatus() == null ? null : req.getOrder().getStatus() ;
                row[5] = req.getOrder().getBillAmount();
                dtm.addRow(row);
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
        tblOrders = new javax.swing.JTable();
        btnViewDet = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Orders ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Date", "Site", "Status", "Order Message", "Order Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 71, 880, 143));

        btnViewDet.setText("View Details");
        btnViewDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetActionPerformed(evt);
            }
        });
        add(btnViewDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        btnApprove.setText("Approve Order");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        btnCancel.setText("Decline Order");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 28, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Vaccine", "Quantity", "Manufacturer", "State Funding", "Federal Funding"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderDetails);
        if (tblOrderDetails.getColumnModel().getColumnCount() > 0) {
            tblOrderDetails.getColumnModel().getColumn(0).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(1).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(2).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(3).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(4).setResizable(false);
            tblOrderDetails.getColumnModel().getColumn(5).setResizable(false);
        }

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 840, 193));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Order Details ");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 910, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to view details!");
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel) tblOrderDetails.getModel();
            dtm.setRowCount(0);
            
            //Order order = (Order) tblOrders.getValueAt(selectedRow, 0);
            WorkRequest req = (WorkRequest) tblOrders.getValueAt(selectedRow, 3);
            
            for(OrderItem oi : req.getOrder().getOrderItemList()){
                Object[] row = new Object[6];
                row[0] = oi.getVaccineType();
                row[1] = oi.getVaccine();
                row[2] = oi.getBatchQuantity();
                row[3] = oi.getManufacturer();
                row[4] = oi.getVaccineType().getFundingInfo();
                
                boolean flag = getStateFundingDetails(oi.getVaccineType());
                
                if(flag == true) row[5] = "YES";
                else row[5] = "NO";
                
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_btnViewDetActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblOrders.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to approve!");
        }else{
            WorkRequest req = (WorkRequest) tblOrders.getValueAt(selectedRow, 3);
            
            if(!req.getStatus().equals("Order Approved")){
            req.setStatus("Order Approved");
            req.getOrder().setStatus("Pending At The State PHD");
            req.setReceiver(userAccount);
            Calendar cal = Calendar.getInstance();
            req.setResolveDate(cal.getTime());
            req.getOrder().setTimeStamp(cal.getTime());
            
            WorkRequest newRequest = new WorkRequest();
            newRequest.setRequestDate(cal.getTime());
            newRequest.setSender(userAccount);
            newRequest.setOrder(req.getOrder());
            userAccount.getWorkQueue().getWorkRequestList().add(newRequest);
            newRequest.setStatus("Pending Approval!");
            
            for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
            if(e instanceof PHDEnterprise){
                PHDEnterprise pe = (PHDEnterprise)e;
                for(Enterprise ent : pe.getEnterpriseDirectory().getEnterpriseList()){
                    if(ent instanceof ProviderEnterprise && ent.equals(providerEnterprise)){
                       pe.getWorkQueue().getWorkRequestList().add(newRequest);
                    }
                }
            }
            
            }
            }else {
                JOptionPane.showMessageDialog(null, "This Order was already approved!");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to cancel!");
        }else{
            WorkRequest req = (WorkRequest) tblOrders.getValueAt(selectedRow, 3);
            
            if(!req.getStatus().equals("Order Approved")){
            req.setStatus("Order Declined");
            req.getOrder().setStatus("Declined by Provider");
            req.setReceiver(userAccount);
            Calendar cal = Calendar.getInstance();
            req.setResolveDate(cal.getTime());
            req.getOrder().setTimeStamp(cal.getTime());
            }else{
                JOptionPane.showMessageDialog(null, "This order request cannot be declined!");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean getStateFundingDetails(VaccineType vt){
        
        for(Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()){
            if(e instanceof PHDEnterprise){
                PHDEnterprise pe = (PHDEnterprise)e;
                for(Enterprise ent : pe.getEnterpriseDirectory().getEnterpriseList()){
                    if(ent instanceof ProviderEnterprise && ent.equals(providerEnterprise)){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnViewDet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrderDetails;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
