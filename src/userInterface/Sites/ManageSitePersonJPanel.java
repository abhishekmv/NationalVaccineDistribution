/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Sites;


import userInterface.Distributor.*;
import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.SiteEnterprise;
import business.Person.Person;
import business.Person.PersonDirectory;
import business.Utility.Utility;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageSitePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDistributorPersonJPanel
     */
    private JPanel userProcessContainer;
    private SiteEnterprise siteEnterprise;
    private PersonDirectory personDirectory;
    
    public ManageSitePersonJPanel(JPanel userProcessContainer, SiteEnterprise siteEnterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.siteEnterprise = siteEnterprise;
        this.personDirectory = siteEnterprise.getPersonDirectory();
        populateTable();
        poplulateGenderCombo();
        addPersonJLayeredPane.setVisible(false);
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblPersonDetails.getModel();
        dtm.setRowCount(0);
        
        for(Person p : personDirectory.getPersonList()){
            Object[] row = new Object[7];
            row[0] = p.getFirstName();
            row[1] = p.getLastName();
            row[2] = p.getSsn();
            row[3] = p.getContactNo();
            row[4] = p.getEmailid();
            row[5] = p.getAddress().getStreetName() + " " + p.getAddress().getCity() + " " + p.getAddress().getState() + " " + p.getAddress().getZipcode();
            row[6] = p.getGender();
            dtm.addRow(row);
        }
    }

      public void poplulateGenderCombo()
    {
        genderJComboBox.removeAllItems();
        
        genderJComboBox.addItem(Person.MALE);
        genderJComboBox.addItem(Person.FEMALE);
        genderJComboBox.addItem(Person.OTHERS);
    
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
        btnAddPerson = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonDetails = new javax.swing.JTable();
        addPersonJLayeredPane = new javax.swing.JLayeredPane();
        timeStampJDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFn = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        txtState = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtssn = new javax.swing.JTextField();
        emailJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        contactJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        genderJComboBox = new javax.swing.JComboBox();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Site Person");

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblPersonDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "SSN", "Contact Number", "Email ID", "Address", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonDetails);

        addPersonJLayeredPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addPersonJLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addPersonJLayeredPane.add(timeStampJDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Add A New Person");
        addPersonJLayeredPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 30));

        jLabel10.setText("City");
        addPersonJLayeredPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 30, -1));

        jLabel9.setText("Zip");
        addPersonJLayeredPane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 30, -1));
        addPersonJLayeredPane.add(txtFn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 30));
        addPersonJLayeredPane.add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 180, 30));

        jLabel2.setText("First Name");
        addPersonJLayeredPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 80, 80, -1));

        jLabel5.setText("SSN");
        addPersonJLayeredPane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, -1));
        addPersonJLayeredPane.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 180, 30));

        jLabel6.setText("Street");
        addPersonJLayeredPane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 50, 20));
        addPersonJLayeredPane.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 180, 30));

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        addPersonJLayeredPane.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 72, -1));

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        addPersonJLayeredPane.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 180, 30));

        jLabel3.setText("Last Name");
        addPersonJLayeredPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        addPersonJLayeredPane.add(txtLn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, 30));

        jLabel8.setText("State");
        addPersonJLayeredPane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 40, 20));

        jLabel4.setText("Date Of Birth");
        addPersonJLayeredPane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        addPersonJLayeredPane.add(txtssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, 30));
        addPersonJLayeredPane.add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 30));

        jLabel11.setText("Email ID");
        addPersonJLayeredPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel12.setText("Contact Number");
        addPersonJLayeredPane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        addPersonJLayeredPane.add(contactJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 222, 180, 30));

        jLabel13.setText("Gender ");
        addPersonJLayeredPane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        genderJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addPersonJLayeredPane.add(genderJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBack)
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btnAddPerson))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(addPersonJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack)
                    .addComponent(btnRefresh))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(addPersonJLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        addPersonJLayeredPane.setVisible(true);
        
        
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:

        try{
            String fname = txtFn.getText().trim();
            String lname = txtLn.getText().trim();

            String dob = ((timeStampJDateChooser.getDate().toString().substring(0,10))+timeStampJDateChooser.getDate().toString().substring(23));

            String ssn = txtssn.getText().trim();
            String street = txtStreet.getText().trim();
            String city = txtCity.getText().trim();
            String state = txtState.getText().trim();
            String zip = txtZip.getText().trim();
            String email = emailJTextField.getText().trim();
            String contact =  contactJTextField.getText().trim();
            String gender = (String)genderJComboBox.getSelectedItem();
            if(!dob.isEmpty())
            {
                if(Utility.validateTxtFieldsForEmailId(emailJTextField))
                {
                    if(!fname.isEmpty()){
                        if(!lname.isEmpty()){
                            if(Utility.validateTxtFieldsForSSN(txtssn)){
                                if(!street.isEmpty()){
                                    if(!city.isEmpty()){
                                        if(!state.isEmpty()){

                                            if(Utility.validateTxtFieldsForZipCode(txtZip))
                                            {

                                                if(Utility.validateTxtFieldsForPhoneNumber(contactJTextField))
                                                {
                                                    boolean flag = personDirectory.checkExisting(Double.parseDouble(ssn));
                                                    if(flag == false){
                                                        Person p = personDirectory.createPerson();
                                                        p.setFirstName(fname);
                                                        p.setLastName(lname);
                                                        p.setSsn(Double.parseDouble(ssn));
                                                        p.setDob(dob);
                                                        p.setEmailid(email);
                                                        p.setContactNo(Double.parseDouble(contact));
                                                        p.getAddress().setStreetName(street);
                                                        p.getAddress().setCity(city);
                                                        p.getAddress().setState(state);
                                                        p.getAddress().setZipcode(Integer.parseInt(zip));
                                                        p.setGender(gender);
                                                        addPersonJLayeredPane.setVisible(false);

                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null, "Person already exists!");
                                                    }

                                                }else{
                                                    JOptionPane.showMessageDialog(null, " The Contact number should of 10 digit number only!");
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null, " The Zipcode should of 5 digit number only!");
                                            }

                                        }else{
                                            JOptionPane.showMessageDialog(null, "State Field Cannot Be Blank!");
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(null, "City Field Cannot Be Blank!");
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null, "street Field Cannot Be Blank!");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "The SSN should of 9 digit number only!");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Last Name Cannot Be Blank!");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "First Name Cannot Be Blank!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Enter an Email in the following format  - abc@mail.com");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter an valid date of birth!");
            }
            populateTable();
        }
        catch(NumberFormatException ne)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid number for SSN and ZipCode" );
            // personDirectory.removePerson(p);
        }
        catch(NullPointerException n)
        {
            JOptionPane.showMessageDialog(null,"Enter a valid date" );
            //  personDirectory.removePerson(p);

        }

        txtCity.setText("");
        txtFn.setText("");
        txtLn.setText("");
        txtState.setText("");
        txtStreet.setText("");
        txtZip.setText("");
        txtssn.setText("");
        emailJTextField.setText("");
        contactJTextField.setText("");
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLayeredPane addPersonJLayeredPane;
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField contactJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonDetails;
    private com.toedter.calendar.JDateChooser timeStampJDateChooser;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFn;
    private javax.swing.JTextField txtLn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    private javax.swing.JTextField txtssn;
    // End of variables declaration//GEN-END:variables
}
