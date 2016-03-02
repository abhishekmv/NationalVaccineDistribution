/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ManufacturerAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManufacturerAdminOrganization extends Organization{
    
       public ManufacturerAdminOrganization() {
        super(Organization.Type.ManufacturerAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerAdminRole());
        return roles;
    }
    
}
