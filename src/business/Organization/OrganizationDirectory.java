/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.Doctor.getValue())){
           organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Shipping.getValue())){
            organization = new ShippingOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DistributorAdmin.getValue())){
            organization = new DistributorAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ManufacturerAdmin.getValue())){
            organization = new ManufacturerAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PHDAdmin.getValue())){
            organization = new PHDAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Provider.getValue())){
            organization = new ProviderOrganization();
            organizationList.add(organization);
        }
        
         else if (type.getValue().equals(Type.SiteAdmin.getValue())){
            organization = new ProviderOrganization();
            organizationList.add(organization);
        }
        
      
         
        
        
        return organization;
    }
    
    
}
