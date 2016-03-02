/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.PHDAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PHDAdminOrganization extends Organization{

       public PHDAdminOrganization() {
        super(Organization.Type.PHDAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PHDAdminRole());
        return roles;
    }
    
    
}
