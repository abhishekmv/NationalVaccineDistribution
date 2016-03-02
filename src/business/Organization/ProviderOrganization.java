/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.ProviderRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ProviderOrganization extends Organization{

     public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
    }
    
}
