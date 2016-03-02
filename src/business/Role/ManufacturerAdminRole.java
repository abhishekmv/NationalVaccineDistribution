/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Manufacturer.ManufacturerWorkAreaJPanel;
import userInterface.PHD.StatePHDWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class ManufacturerAdminRole extends Role{

    
     public ManufacturerAdminRole()
    {
    
        super(RoleType.ManufacuturerAdminRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ManufacturerWorkAreaJPanel(userProcessContainer, system, enterprise,account);
    }
    
}
