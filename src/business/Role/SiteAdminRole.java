/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.SiteEnterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.PHD.StatePHDWorkAreaJPanel;
import userInterface.Sites.HospitalWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class SiteAdminRole extends Role{

     public SiteAdminRole()
    {
    
        super(RoleType.SiteAdminRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new HospitalWorkAreaJPanel(userProcessContainer, system, (SiteEnterprise)enterprise, account);
    }

    
}
