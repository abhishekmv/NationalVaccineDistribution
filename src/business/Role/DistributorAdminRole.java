/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Distributor.DistributorWorkAreaJPanel;


/**
 *
 * @author Abhishek
 */
public class DistributorAdminRole extends Role{

     public DistributorAdminRole()
    {
    
        super(RoleType.DistributorAdminRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DistributorWorkAreaJPanel(userProcessContainer, system,(DistributorEnterprise)enterprise,account);   
    }
    
}
