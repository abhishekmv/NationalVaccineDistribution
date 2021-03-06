/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Sites;

import business.Doctor.Doctor;
import userInterface.SystemAdmin.*;
import business.Enterprise.SiteEnterprise;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Organization.PatientOrganization;
import business.Patient.Patient;
import business.Person.Person;
import business.Person.PersonDirectory;
import business.Role.DoctorRole;
import business.Role.PatientRole;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageSiteUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSiteUserAccountJPanel
     */
    private JPanel userProcessContainer;
     private UserAccountDirectory userAccountDirectory;
      private PersonDirectory personDirectory;
    private OrganizationDirectory  organizationDirectory;
    private SiteEnterprise siteEnterprise;
    
    
    public ManageSiteUserAccountJPanel(JPanel userProcessContainer, SiteEnterprise siteEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = siteEnterprise.getOrganizationDirectory();
       this.siteEnterprise = siteEnterprise;
        this.userAccountDirectory = siteEnterprise.getUserAccountDirectory();
        this.personDirectory = siteEnterprise.getPersonDirectory();
        addUserJLayeredPane.setVisible(false);
        populateTable();
         populatePersonCombo();
        populateOrgCombo();
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

        jLabel7 = new javax.swing.JLabel();
        addUserAccountJButton = new javax.swing.JButton();
        activateJButton = new javax.swing.JButton();
        deactivateJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserAccounts = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        addUserJLayeredPane = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addPatientAccountJButton = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        comboPerson = new javax.swing.JComboBox();
        txtPwd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roleJTextField = new javax.swing.JTextField();
        addDoctorAccountJButton = new javax.swing.JButton();

        jLabel7.setText("Select Person");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUserAccountJButton.setText("Add New User Account");
        addUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserAccountJButtonActionPerformed(evt);
            }
        });
        add(addUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 185, -1, -1));

        activateJButton.setText("Activate Account");
        activateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateJButtonActionPerformed(evt);
            }
        });
        add(activateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 185, -1, -1));

        deactivateJButton.setText("Deactivate Account");
        deactivateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateJButtonActionPerformed(evt);
            }
        });
        add(deactivateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 185, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Site User Accounts");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 21, -1, -1));

        tblUserAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "User Name", "Role", "Organization", "Status"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 61, 793, 93));

        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 185, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 21, -1, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 21, -1, -1));

        addUserJLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addUserJLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Status");
        addUserJLayeredPane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel4.setText("Name");
        addUserJLayeredPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, -1));

        jLabel3.setText("Select Person");
        addUserJLayeredPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 20));

        addPatientAccountJButton.setText("Add Patient Details");
        addPatientAccountJButton.setEnabled(false);
        addPatientAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientAccountJButtonActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(addPatientAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 440, 150, -1));

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, 30));
        addUserJLayeredPane.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, 30));

        comboPerson.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 30));
        addUserJLayeredPane.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Add New User Accounts");
        addUserJLayeredPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, -1));

        jLabel5.setText("User Name");
        addUserJLayeredPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, -1));

        jLabel6.setText("Password");
        addUserJLayeredPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 60, -1));

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(comboStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, 30));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 146, 30));

        jLabel11.setText("Organization");
        addUserJLayeredPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel12.setText("Role");
        addUserJLayeredPane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        roleJTextField.setEditable(false);
        addUserJLayeredPane.add(roleJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 150, 30));

        addDoctorAccountJButton.setText("Add Doctor Details");
        addDoctorAccountJButton.setEnabled(false);
        addDoctorAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorAccountJButtonActionPerformed(evt);
            }
        });
        addUserJLayeredPane.add(addDoctorAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 150, -1));

        add(addUserJLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 253, 411, 505));
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblUserAccounts.getModel();
        dtm.setRowCount(0);
        
       
        for(Organization organization : organizationDirectory.getOrganizationList()){
            for(UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
                Object[] row = new Object[6];
                row[0] = ua.getPerson().getFirstName();
                row[1] = ua.getPerson().getLastName();
                row[2] = ua;
                row[3] = ua.getRole().getRoleName();
                row[4] = organization.getName();
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
    
    public void populateOrgCombo(){
        organizationJComboBox.removeAllItems();
        
       for(Organization o : siteEnterprise.getOrganizationDirectory().getOrganizationList())
       {
           organizationJComboBox.addItem(o);
       
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

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

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

    private void addDoctorAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorAccountJButtonActionPerformed
        // TODO add your handling code here:

        String uname = txtUname.getText().trim();
        String pwd = txtPwd.getText().trim();
        Person person = (Person) comboPerson.getSelectedItem();
        Organization o = (Organization) organizationJComboBox.getSelectedItem();

        String status = (String) comboStatus.getSelectedItem();

        if(comboPerson.getSelectedItem()!=null)
        {
            if(!uname.isEmpty()){
                if(!pwd.isEmpty()){
                    boolean flag = userAccountDirectory.checkIfUsernameIsUnique(uname,userAccountDirectory.getUserAccountList());
                    if(flag == false){

                        for(Organization or : siteEnterprise.getOrganizationDirectory().getOrganizationList())
                        {

                            if(o instanceof DoctorOrganization && or instanceof DoctorOrganization)
                            {
                                boolean check =  o.getUserAccountDirectory().checkIfUsernameIsUnique(uname,userAccountDirectory.getUserAccountList());
                                if(check == false)
                                {
                                    UserAccount userAccount = new UserAccount();
                                   userAccount.setUserName(uname);
                                     userAccount.setPassword(pwd);
                                    userAccount.setStatus(status);
                               userAccount.setRole(new DoctorRole());

                               Person p = new Person();
                               p.setFirstName(person.getFirstName());
                               p.setLastName(person.getLastName());
                              p.setSsn(person.getSsn());
                              p.setAddress(person.getAddress());
                              p.setContactNo(person.getContactNo());
                              p.setEmailid(person.getEmailid());
                               p.setDob(person.getDob());

                        userAccount.setPerson(p);
                                   

                                    AddDoctorDetailsJPanel addjp = new AddDoctorDetailsJPanel(userProcessContainer,(DoctorOrganization)o,userAccount);
                                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                                    userProcessContainer.add("AddDoctorDetailsJPanel", addjp);
                                    layout.next(userProcessContainer);
                                    txtUname.setText("");
                                    txtPwd.setText("");

                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "User Name already exists!");
                                }

                            }

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
        }
        else
        {

            JOptionPane.showMessageDialog(null, "Add a person before adding an user account");

        }

        addUserJLayeredPane.setVisible(false);
        populateTable();
          txtUname.setText("");
     txtPwd.setText("");

    }//GEN-LAST:event_addDoctorAccountJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){

            if( organization instanceof DoctorOrganization)
            {
                roleJTextField.setText(Role.RoleType.DoctorRole.getValue());
                addDoctorAccountJButton.setEnabled(true);
                addPatientAccountJButton.setEnabled(false);
            }
            else if(organization instanceof PatientOrganization)
            {
                roleJTextField.setText(Role.RoleType.PatientRole.getValue());
                addPatientAccountJButton.setEnabled(true);
                addDoctorAccountJButton.setEnabled(false);
            }

        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed

    private void comboPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonActionPerformed
        // TODO add your handling code here:
        Person p = (Person)comboPerson.getSelectedItem();
         
        if(p!=null)
        {
            txtName.setText(p.getFirstName()+" "+p.getLastName());
        
        }
    }//GEN-LAST:event_comboPersonActionPerformed

    private void addPatientAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientAccountJButtonActionPerformed
        // TODO add your handling code here:
        String uname = txtUname.getText().trim();
        String pwd = txtPwd.getText().trim();
        Person person = (Person) comboPerson.getSelectedItem();
        String email = person.getEmailid();
        Organization o = (Organization) organizationJComboBox.getSelectedItem();

        String status = (String) comboStatus.getSelectedItem();

        if(comboPerson.getSelectedItem()!=null)
        {
            if(!uname.isEmpty()){
                if(!pwd.isEmpty()){
                    boolean flag = userAccountDirectory.checkIfUsernameIsUnique(uname,userAccountDirectory.getUserAccountList());
                    if(flag == false){

                        for(Organization or : siteEnterprise.getOrganizationDirectory().getOrganizationList())
                        {

                            if(o instanceof PatientOrganization && or instanceof PatientOrganization)
                            {

                                boolean check =  o.getUserAccountDirectory().checkIfUsernameIsUnique(uname,userAccountDirectory.getUserAccountList());
                                if(check == false)
                                {
                                     UserAccount userAccount = new UserAccount();
                        userAccount.setUserName(uname);
                        userAccount.setPassword(pwd);
                        userAccount.setStatus(status);
                        userAccount.setRole(new PatientRole());

                        Person p = new Person();
                        p.setFirstName(person.getFirstName());
                        p.setLastName(person.getLastName());
                        p.setSsn(person.getSsn());
                        p.setAddress(person.getAddress());
                        p.setDob(person.getDob());
                        p.setContactNo(person.getContactNo());
                        p.setGender(person.getGender());
                        p.setEmailid(person.getEmailid());

                        userAccount.setPerson(p);
                                  

                                    AddPatientDetailsJPanel apdjp = new AddPatientDetailsJPanel(userProcessContainer,userAccount, (PatientOrganization)o);
                                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                                    userProcessContainer.add("AddPatientDetailsJPanel", apdjp);
                                    layout.next(userProcessContainer);
                                    
                                    txtUname.setText("");
                      txtPwd.setText("");

                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "User Name already exists!");
                                }

                            }

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
        }
        else
        {

            JOptionPane.showMessageDialog(null, "Add a person before adding an user account");

        }

        addUserJLayeredPane.setVisible(false);
        populateTable();
          txtUname.setText("");
             txtPwd.setText("");
    }//GEN-LAST:event_addPatientAccountJButtonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activateJButton;
    private javax.swing.JButton addDoctorAccountJButton;
    private javax.swing.JButton addPatientAccountJButton;
    private javax.swing.JButton addUserAccountJButton;
    private javax.swing.JLayeredPane addUserJLayeredPane;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox comboPerson;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JButton deactivateJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField roleJTextField;
    private javax.swing.JTable tblUserAccounts;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtUname;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
