/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Person.Person;
import business.Person.PersonDirectory;
import business.Role.DistributorAdminRole;
import business.Role.ManufacturerAdminRole;
import business.Role.PHDAdminRole;

import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import business.Utility.SendEmail;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageCDCUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCDCUserAccountJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
     private UserAccountDirectory userAccountDirectory;
      private PersonDirectory personDirectory;
   
    private EnterpriseDirectory enterpriseDirectory;
    
    public ManageCDCUserAccountJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterpriseDirectory = system.getEnterpriseDirectory();
        this.userAccountDirectory = system.getUserAccountDirectory();
        this.personDirectory = system.getPersonDirectory();
        addUserJLayeredPane.setVisible(false);
        populateTable();
         populatePersonCombo();
        populateEnterpriseCombo();
        populateStatusCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserAccountJButton = new javax.swing.JButton();
        activateJButton = new javax.swing.JButton();
        deactivateJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        addUserJLayeredPane = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        comboPerson = new javax.swing.JComboBox();
        txtPwd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboEntType = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox();
        comboEntName = new javax.swing.JComboBox();

        addUserAccountJButton.setText("Add New User Account");
        addUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserAccountJButtonActionPerformed(evt);
            }
        });

        activateJButton.setText("Activate Account");
        activateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateJButtonActionPerformed(evt);
            }
        });

        deactivateJButton.setText("Deactivate Account");
        deactivateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage User Accounts");

        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "User Name", "Role", "Enterprise", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserAccounts);

        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addUserJLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Enterprise Name");
        addUserJLayeredPane.add(jLabel8);
        jLabel8.setBounds(80, 230, 95, 16);

        jLabel9.setText("Status");
        addUserJLayeredPane.add(jLabel9);
        jLabel9.setBounds(140, 270, 36, 16);

        jLabel4.setText("Name");
        addUserJLayeredPane.add(jLabel4);
        jLabel4.setBounds(123, 90, 50, 16);

        jLabel3.setText("Select Person");
        addUserJLayeredPane.add(jLabel3);
        jLabel3.setBounds(100, 60, 78, 16);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(btnAdd);
        btnAdd.setBounds(180, 310, 59, 25);

        txtName.setEditable(false);
        addUserJLayeredPane.add(txtName);
        txtName.setBounds(200, 90, 120, 30);
        addUserJLayeredPane.add(txtUname);
        txtUname.setBounds(200, 120, 120, 30);

        comboPerson.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboPerson);
        comboPerson.setBounds(200, 62, 120, 20);
        addUserJLayeredPane.add(txtPwd);
        txtPwd.setBounds(200, 152, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Add New User Accounts");
        addUserJLayeredPane.add(jLabel2);
        jLabel2.setBounds(110, 20, 190, 22);

        comboEntType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEntType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntTypeActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboEntType);
        comboEntType.setBounds(200, 192, 120, 30);

        jLabel5.setText("User Name");
        addUserJLayeredPane.add(jLabel5);
        jLabel5.setBounds(110, 130, 70, 16);

        jLabel6.setText("Password");
        addUserJLayeredPane.add(jLabel6);
        jLabel6.setBounds(110, 160, 60, 16);

        jLabel7.setText("Enterprise Type");
        addUserJLayeredPane.add(jLabel7);
        jLabel7.setBounds(80, 200, 90, 16);

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboStatus);
        comboStatus.setBounds(200, 260, 120, 22);

        comboEntName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEntName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntNameActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboEntName);
        comboEntName.setBounds(200, 230, 120, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(backJButton)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(addUserJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(activateJButton)
                        .addGap(63, 63, 63)
                        .addComponent(deactivateJButton)
                        .addGap(66, 66, 66)
                        .addComponent(addUserAccountJButton)
                        .addGap(63, 63, 63)
                        .addComponent(viewDetailsJButton)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activateJButton)
                    .addComponent(deactivateJButton)
                    .addComponent(addUserAccountJButton)
                    .addComponent(viewDetailsJButton))
                .addGap(29, 29, 29)
                .addComponent(addUserJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblUserAccounts.getModel();
        dtm.setRowCount(0);
        
       
        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                Object[] row = new Object[6];
                row[0] = ua.getPerson().getFirstName();
                row[1] = ua.getPerson().getLastName();
                row[2] = ua;
                row[3] = ua.getRole().getRoleName();
                row[4] = e.getName();
                row[5] = ua.getStatus();
                dtm.addRow(row);
        
            }
        }
        
    }
    
      public void populatePersonCombo(){
         comboPerson.removeAllItems();
        
        for(Person p : personDirectory.getPersonList()){
            comboPerson.addItem(p);
        }
    }
    
    public void populateEnterpriseCombo(){
        comboEntType.removeAllItems();
        
        for(Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()){
            if(!type.getValue().equals(Enterprise.EnterpriseType.Provider.getValue())){
                if(!type.getValue().equals(Enterprise.EnterpriseType.Site.getValue())){
                    if(!type.getValue().equals(Enterprise.EnterpriseType.Clinic.getValue())){
                        comboEntType.addItem(type);
                    }
                }
            }
        }
    }
    
     public void populateStatusCombo(){
        comboStatus.removeAllItems();
        
        comboStatus.addItem(UserAccount.ACTIVE);
        comboStatus.addItem(UserAccount.DEACTIVE);
    }
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserAccountJButtonActionPerformed
        // TODO add your handling code here:
          addUserJLayeredPane.setVisible(true);
        
    }//GEN-LAST:event_addUserAccountJButtonActionPerformed

    private void deactivateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactivateJButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblUserAccounts.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }else{
            UserAccount ua = (UserAccount) tblUserAccounts.getValueAt(selectedRow, 2);
            ua.setStatus(UserAccount.DEACTIVE);
            populateTable();
        }
    }//GEN-LAST:event_deactivateJButtonActionPerformed

    private void activateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateJButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblUserAccounts.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
            UserAccount ua = (UserAccount) tblUserAccounts.getValueAt(selectedRow, 2);
            ua.setStatus(UserAccount.ACTIVE);
            populateTable();
        
    }//GEN-LAST:event_activateJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblUserAccounts.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        UserAccount ua = (UserAccount) tblUserAccounts.getValueAt(selectedRow, 2);
        
        ViewUserAccountDetailsJPanel vuadjp = new ViewUserAccountDetailsJPanel(userProcessContainer,ua);
        userProcessContainer.add("ViewUserAccountDetailsJPanel", vuadjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String uname = txtUname.getText().trim();
        String pwd = txtPwd.getText().trim();
        Person person = (Person) comboPerson.getSelectedItem();
        String email = person.getEmailid();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboEntType.getSelectedItem();
        Enterprise enterprise = (Enterprise) comboEntName.getSelectedItem();

        String status = (String) comboStatus.getSelectedItem();
        
     if(comboPerson.getSelectedItem()!=null)
      {
        if(enterprise!=null)
        {
        if(!uname.isEmpty()){
            if(!pwd.isEmpty()){
                boolean flag = userAccountDirectory.checkIfUsernameIsUnique(uname,enterprise.getUserAccountDirectory().getUserAccountList());
                if(flag == false){

                    UserAccount ua = enterprise.getUserAccountDirectory().createUserAccount(uname, pwd, person, null);
                    ua.setStatus(status);
                    
                     txtUname.setText("");
                      txtPwd.setText("");
                      
                    
                     if(type.equals(Enterprise.EnterpriseType.Distributor)){
                            ua.setRole(new DistributorAdminRole());
                             String subject="Congratulations, You are now a Single National Distributor for Center Of Disease Control,USA";
                             String message="You enterprise login credentials are - userid is :"+uname+" and password is :"+pwd;
                             SendEmail.SendEmail(email,subject, message);
                            
                        }
                        
                        else if(type.equals(Enterprise.EnterpriseType.Manufacturer)){
                            ua.setRole(new ManufacturerAdminRole());
                            
                             String subject="Congratulations, You are now a Approved manufacturer for Center Of Disease Control, USA";
                             String message="You enterprise login credentials are - userid is :"+uname+" and password is :"+pwd;
                             SendEmail.SendEmail(email,subject, message);
                            
                            
                        }
                        
                         else if(type.equals(Enterprise.EnterpriseType.PHD)){
                            ua.setRole(new PHDAdminRole());
                        }

                }else{
                    JOptionPane.showMessageDialog(null, "User Name already exists!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Enter A Password");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Enter A User Name");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Add an enterprise before creating an user account");
        }
      }
     else
     {
          JOptionPane.showMessageDialog(null, "Add a person before adding an user account");
     }
        addUserJLayeredPane.setVisible(false);
        populateTable();

    }//GEN-LAST:event_btnAddActionPerformed

    private void comboEntTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntTypeActionPerformed
        // TODO add your handling code here:
        comboEntName.removeAllItems();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboEntType.getSelectedItem();

        for(Enterprise e : enterpriseDirectory.getEnterpriseList()){
            if(e.getEnterpriseType().equals(type)){
                comboEntName.addItem(e);
            }
        }
    }//GEN-LAST:event_comboEntTypeActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void comboEntNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEntNameActionPerformed

    private void comboPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonActionPerformed
        // TODO add your handling code here:
        Person p = (Person)comboPerson.getSelectedItem();
        
        if(p!=null)
        {
            txtName.setText(p.getFirstName()+" "+p.getLastName());
        
        }
    }//GEN-LAST:event_comboPersonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateJButton;
    private javax.swing.JButton addUserAccountJButton;
    private javax.swing.JLayeredPane addUserJLayeredPane;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox comboEntName;
    private javax.swing.JComboBox comboEntType;
    private javax.swing.JComboBox comboPerson;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JButton deactivateJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUserAccounts;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtUname;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
