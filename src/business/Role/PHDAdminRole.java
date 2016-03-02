/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.PHDEnterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.PHD.StatePHDWorkAreaJPanel;
import userInterface.SystemAdmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class PHDAdminRole extends Role{

     public PHDAdminRole()
    {
    
        super(RoleType.PHDAdminRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
              return new StatePHDWorkAreaJPanel(userProcessContainer,(PHDEnterprise)enterprise, system,account);

    }
    
}
