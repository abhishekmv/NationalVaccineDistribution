 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Vaccine.BatchDirectory;


/**
 *
 * @author Abhishek
 */
public abstract class Enterprise extends Organization{
    
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private BatchDirectory batchDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        batchDirectory = new BatchDirectory();
    }

    
    
    public enum EnterpriseType{
        Site("Site"),
        PHD("PHD"),
        Provider("Provider"),
        Clinic("Clinic"),
        Manufacturer("Manufacturer"),
        Distributor("Distributor");
       // Pharmacy("Pharmacy");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public BatchDirectory getBatchDirectory() {
        return batchDirectory;
    }

    public void setBatchDirectory(BatchDirectory batchDirectory) {
        this.batchDirectory = batchDirectory;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    
    
    
}
