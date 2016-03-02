/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.DistributorAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class DistributorAdminOrganization extends Organization{

       public DistributorAdminOrganization() {
        super(Organization.Type.DistributorAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorAdminRole());
        return roles;
    }
    
    
}
