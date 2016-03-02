/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.PHDEnterprise;
import business.Network.StateNetwork;
import business.Network.StateNetworkDirectory;
import business.State.State;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageStateNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStateNetworkJPanel
     */
     private EcoSystem system;
    private StateNetworkDirectory stateNetworkDirectory;
    private JPanel userProcessContainer;
    private EnterpriseDirectory enterpriseDirectory;
    public ManageStateNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
       this.system = system;
        stateNetworkDirectory = system.getStateNetworkDirectory();
        this.userProcessContainer = userProcessContainer;
        this.enterpriseDirectory = system.getEnterpriseDirectory();
        txtEntType.setText(Enterprise.EnterpriseType.PHD.getValue());
        populateRegionComboBox();
        populateNetworkTable();
        totalPopulation();
    }
    
    private void totalPopulation()
    {
        populationJTextField.setText(String.valueOf(system.totalPopulation()));
        
    
    }
    
    
    private void populateNetworkTable()
    {
    
          DefaultTableModel dtm = (DefaultTableModel) networkJTable.getModel();
        dtm.setRowCount(0);
        
        for(StateNetwork sn : stateNetworkDirectory.getStateNetwork()){
            Object[] row = new Object[7];
            row[0] = sn.getState().getStatePHD().getOrganizationID();
            row[1] = sn.getState().getStatePHD().getName();
            row[2] = sn.getState().getName();
            row[3] = sn.getState().getPopulation();            
            row[4] = system.totalPercentage(system.totalPopulation(), sn.getState().getName());
            row[5] = sn.getState().getRegion();
            row[6] = sn.getState().getAcronym();
            dtm.addRow(row);
    
    }
    }

    private void populateRegionComboBox()
    {
                regionJComboBox.removeAllItems();
                regionJComboBox.addItem(State.NORTHEAST);
                regionJComboBox.addItem(State.SOUTH);
                regionJComboBox.addItem(State.WEST);
                regionJComboBox.addItem(State.MIDWEST);

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
        networkJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPHDname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEntType = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPopulation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        regionJComboBox = new javax.swing.JComboBox();
        btnRefresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        populationJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage PHD-State Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 27, -1, -1));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PHD Id", "PHD Name", "State", "Population", "Contribution (%)", "Region", "Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 1047, 103));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Add New State Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 214, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 23, -1, -1));

        btnAdd.setText("Add State Network");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 467, -1, -1));

        jLabel3.setText("State Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 269, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 263, 161, -1));

        jLabel9.setText("State Code");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 303, -1, -1));
        add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 297, 161, -1));

        jLabel5.setText("Associated PHD Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 405, -1, -1));
        add(txtPHDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 399, 161, -1));

        jLabel6.setText("Enterprise Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 439, -1, -1));

        txtEntType.setEnabled(false);
        add(txtEntType, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 433, 161, -1));

        jLabel7.setText("Population");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 337, -1, -1));
        add(txtPopulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 331, 161, -1));

        jLabel8.setText("Region");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 369, -1, -1));

        regionJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(regionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 365, 161, -1));

        btnRefresh.setText("Refresh!");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 214, -1, -1));

        jLabel4.setText("Total US Population : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 31, -1, -1));

        populationJTextField.setEditable(false);
        add(populationJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 24, 132, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String stateName = txtName.getText().trim();
        String code = txtCode.getText().trim();

        if(!txtPopulation.getText().trim().isEmpty()){
            try{
                double population = Double.parseDouble(txtPopulation.getText().trim());

                String phd = txtPHDname.getText().trim();
                String region = (String) regionJComboBox.getSelectedItem();

                if(stateName.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter state name");
                }else{
                    if(code.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Please enter state code");
                    }else{
                        if(phd.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Please enter PHD name");
                        }else{
                            StateNetwork state = stateNetworkDirectory.createNetwork(stateName);
                            if(state!=null){
                                state.getState().setName(stateName);
                                state.getState().setAcronym(code);
                                state.getState().setPopulation(population);
                                state.getState().setRegion(region);
                                PHDEnterprise enterprise = (PHDEnterprise) enterpriseDirectory.createAndAddEnterprise(phd, Enterprise.EnterpriseType.PHD);
                                state.getState().setStatePHD(enterprise);
                                ((PHDEnterprise)enterprise).setStateName(stateName);
                                txtName.setText("");
                                txtCode.setText("");
                                txtPHDname.setText("");
                                txtPopulation.setText("");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "State already exists in the network!!");
                                txtCode.setText("");
                                txtPHDname.setText("");
                                txtPopulation.setText("");
                            }

                        }

                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Enter integer value for population!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter state population!");
        }
        populateNetworkTable();
        totalPopulation();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        if(!stateNetworkDirectory.getStateNetwork().isEmpty()){
            populateNetworkTable();
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
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
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField populationJTextField;
    private javax.swing.JComboBox regionJComboBox;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEntType;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPHDname;
    private javax.swing.JTextField txtPopulation;
    // End of variables declaration//GEN-END:variables
}