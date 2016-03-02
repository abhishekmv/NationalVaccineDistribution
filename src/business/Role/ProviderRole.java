/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.ProviderEnterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Provider.ProviderWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class ProviderRole extends Role{

    
    public ProviderRole()
    {
    
        super(RoleType.ProviderRole.getValue());
    
    }
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ProviderWorkAreaJPanel(userProcessContainer,account,(ProviderEnterprise)enterprise,system);
    }
    
}
