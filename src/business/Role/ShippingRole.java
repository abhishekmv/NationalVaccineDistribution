/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.DistributorEnterprise;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Organization.ShippingOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

import userInterface.Shipment.ShipmentWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class ShippingRole extends Role{

    
     public ShippingRole()
    {
    
        super(RoleType.ShippingRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         return  new ShipmentWorkAreaJPanel(userProcessContainer,(DistributorEnterprise)enterprise,(ShippingOrganization)organization,account);
    }
    
}
