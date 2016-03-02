/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.SystemAdmin;



import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.SiteEnterprise;
import business.Order.OrderItem;
import business.PaymentTransaction.BankAccount;
import business.PaymentTransaction.Transaction;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.Vaccine.Batch;
import business.Vaccine.Vaccine;
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
public class CDCOrderBillPaymentJPanel extends javax.swing.JPanel {
    
    private JPanel upc;
    private UserAccount userAcc;
    private SiteEnterprise site;
    private EcoSystem system;

    /**
     * Creates new form BillPaymentPanel
     */
    public CDCOrderBillPaymentJPanel(JPanel upc,UserAccount userAcc,EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.userAcc = userAcc;
        this.site = site;
        this.system = system;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblPayments.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest req : userAcc.getWorkQueue().getWorkRequestList()){
            if(req.getOrder()!=null )
            {
                    if(req.getOrder().getStatus().equals("Order Approved And Shipped")){
                if(req.getSender().equals(userAcc)){
                    if(req.getOrder().getCDCPaymentStatus().equals("NO")){
                        Object[] row = new Object[4];
                        row[0] = req.getOrder().getOrderNumber();
                        row[1] = req.getOrder().getBillAmount();
                        row[2] = req.getOrder().getTimeStamp();
                        UserAccount ua = getDistributorAdminAccount();
                        row[3] =ua.getAccountNumber();
                        dtm.addRow(row);
                    }
                }
                    }
            }
        }
    }
    
     public  UserAccount getDistributorAdminAccount()
    {
        UserAccount ua = null ;
        
        for(Enterprise enterprise : system.getEnterpriseDirectory().getEnterpriseList())
        {
            if(enterprise instanceof DistributorEnterprise)
            {
                DistributorEnterprise distributorEnterprise = (DistributorEnterprise)enterprise;
                for(UserAccount userAccount : distributorEnterprise.getUserAccountDirectory().getUserAccountList())
                {
                    if(userAccount.getRole().getRoleName().equals(Role.RoleType.DistributorAdminRole.getValue()))
                    {
                    
                        ua=userAccount;
                    
                    }
                
                }
                
            
            }
        
        }
        return ua;
    
    }
    
    private float getAmountDue(WorkRequest request)
    {
    
        float amount = 0;
        for(OrderItem oi : request.getOrder().getOrderItemList())
        {
            for(Batch b : oi.getBatchList())
            {
            
                for(Vaccine v : b.getVaccineList())
                {
                    if(v.getVaccineType().getFundingInfo().equals(VaccineType.FEDERALLYFUNDED))
                    {
                        
                                amount = amount + (v.getvPrice()*20);
                                break;

                    
                    }
                    break;
                }
            }
        
        }
    return amount;
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
        tblPayments = new javax.swing.JTable();
        btnPay = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Payment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        tblPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Amount Due", "Order Date", "Pay To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPayments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 430, 152));

        btnPay.setText("Make Payment");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 130, 30));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPayments.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to pay the bill!");
        }else{
            float amount = (float)tblPayments.getValueAt(selectedRow, 1);
            BankAccount acc = (BankAccount) tblPayments.getValueAt(selectedRow, 3);
            String orderId = (String) tblPayments.getValueAt(selectedRow, 0);
            if(amount > userAcc.getAccountNumber().getBalance()){
                JOptionPane.showMessageDialog(null, "Not enough balance to pay the bill!");
            }
            else{
                float bal = userAcc.getAccountNumber().getBalance();
                bal = bal - amount;
                userAcc.getAccountNumber().setBalance(bal);
                
                float recievedAmt = acc.getBalance();
                recievedAmt = recievedAmt + amount;
                acc.setBalance(recievedAmt);
                
                Transaction t = new Transaction();
                t.setAmount(amount);
                t.setFromAccount(userAcc.getAccountNumber());
                t.setToAccount(acc);
                Calendar cal = Calendar.getInstance();
                t.setDate(cal.getTime());
                t.setOrderId(orderId);
                
                userAcc.getAccountNumber().getTransaction().add(t);
                acc.getTransaction().add(t);
                
                for(WorkRequest req : userAcc.getWorkQueue().getWorkRequestList()){
                    if(req.getOrder() != null){
                        if(req.getOrder().getOrderNumber().equals(orderId)){
                            req.getOrder().setCDCPaymentStatus("YES");
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Payment Successful!");
            }
        }
        populateTable();
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) upc.getLayout();
        upc.remove(this);
        layout.previous(upc);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPayments;
    // End of variables declaration//GEN-END:variables
}