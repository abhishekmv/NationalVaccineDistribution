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

/**
 *
 * @author Abhishek
 */
public abstract class Role {
    
    private String roleName;
    
    public Role(String role)
    {
        this.roleName = role;
    
    }
       
     public enum RoleType{
        SystemAdminRole("System Admin"), 
        DoctorRole("Doctor"), 
        PatientRole("Patient"), 
        SiteAdminRole("Site Admin"),
        ShippingRole("Shipping"), 
        PHDAdminRole("PDH Admin"),
        DistributorAdminRole("Distributor Admin"),
        ManufacuturerAdminRole("Manufacuturer Admin"),
        ProviderRole("Provider"),
        WarehouseRole("WarehouseRole");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
     
     
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
