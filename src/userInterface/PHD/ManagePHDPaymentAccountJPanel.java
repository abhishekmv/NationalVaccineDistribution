/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.PHD;

import userInterface.SystemAdmin.*;
import business.EcoSystem;
import business.Enterprise.PHDEnterprise;
import business.Enterprise.SiteEnterprise;
import business.PaymentTransaction.Transaction;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManagePHDPaymentAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCDCPaymentAccountJPanel
     */
    private JPanel upc;
    private UserAccount userAccount;
    private EcoSystem system;
    private PHDEnterprise pHDEnterprise;
    
    public ManagePHDPaymentAccountJPanel(JPanel upc,EcoSystem system,UserAccount userAccount,PHDEnterprise pHDEnterprise) {
        initComponents();
        this.upc = upc;
   
        this.system = system;
        this.userAccount = userAccount;
        this.pHDEnterprise = pHDEnterprise;
        populateTextBox();
    }
    
     public void populateTextBox(){
        txtAccNum.setText(userAccount.getAccountNumber().getAccountNumber());
        txtBalance.setText(String.valueOf(userAccount.getAccountNumber().getBalance()));
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
        btnBack = new javax.swing.JButton();
        txtBalance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactionHist = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtAccNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        btnPaid = new javax.swing.JButton();
        btnRecieved = new javax.swing.JButton();
        btnPayBills = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Accounts And Payments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtBalance.setEditable(false);
        add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 126, -1));

        jLabel2.setText("Account Balance");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        tblTransactionHist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "From Account", "To Account", "Date", "Amount", "Order Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransactionHist);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 560, 170));

        jLabel3.setText("Account Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtAccNum.setEditable(false);
        add(txtAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 126, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Transaction History");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Deposit Money");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 15, -1, -1));

        jLabel6.setText("Amount");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 53, -1, -1));
        jLayeredPane1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 50, 108, -1));

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 90, -1, -1));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 310, 160));

        btnPaid.setText("View Paid Bills");
        btnPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaidActionPerformed(evt);
            }
        });
        add(btnPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        btnRecieved.setText("View Recieved Bills");
        btnRecieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecievedActionPerformed(evt);
            }
        });
        add(btnRecieved, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 160, -1));

        btnPayBills.setText("Pay Bills");
        btnPayBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBillsActionPerformed(evt);
            }
        });
        add(btnPayBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 445, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here
        CardLayout layout = (CardLayout) upc.getLayout();
        upc.remove(this);
        layout.previous(upc);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        try{
            float amt = Float.parseFloat(txtAmount.getText());

            float bal = userAccount.getAccountNumber().getBalance();
            bal = bal + amt;
            userAccount.getAccountNumber().setBalance(bal);
           populateTextBox();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter the appropriate balance amount to be deposited! ");
        }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaidActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblTransactionHist.getModel();
        dtm.setRowCount(0);

        for(Transaction t : userAccount.getAccountNumber().getTransaction()){
            if(t.getFromAccount().equals(userAccount.getAccountNumber())){
                Object[] row = new Object[5];
                row[0] = t.getFromAccount();
                row[1] = t.getToAccount();
                row[2] = t.getDate();
                row[3] = t.getAmount();
                row[4] = t.getOrderId();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_btnPaidActionPerformed

    private void btnRecievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecievedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblTransactionHist.getModel();
        dtm.setRowCount(0);

        for(Transaction t : userAccount.getAccountNumber().getTransaction()){
            if(t.getToAccount().equals(userAccount.getAccountNumber())){
                Object[] row = new Object[5];
                row[0] = t.getToAccount();
                row[1] = t.getFromAccount();
                row[2] = t.getDate();
                row[3] = t.getAmount();
                row[4] = t.getOrderId();
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_btnRecievedActionPerformed

    private void btnPayBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBillsActionPerformed
        // TODO add your handling code here:
        PHDOrderBillPaymentJPanel phdobpjp = new PHDOrderBillPaymentJPanel(upc, userAccount ,system,pHDEnterprise);
        CardLayout layout = (CardLayout) upc.getLayout();
        upc.add("PHDOrderBillPaymentJPanel", phdobpjp);
        layout.next(upc);
    }//GEN-LAST:event_btnPayBillsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnPaid;
    private javax.swing.JButton btnPayBills;
    private javax.swing.JButton btnRecieved;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransactionHist;
    private javax.swing.JTextField txtAccNum;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    // End of variables declaration//GEN-END:variables
}
