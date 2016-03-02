/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import business.Role.ShippingRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ShippingOrganization extends Organization{

    public ShippingOrganization() {
        super(Organization.Type.Shipping.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ShippingRole());
        return roles;
        
    }
    
}
