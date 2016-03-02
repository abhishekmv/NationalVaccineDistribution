/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;



import business.Disease.DiseaseDirectory;
import business.Enterprise.EnterpriseDirectory;
import business.Network.StateNetwork;
import business.Network.StateNetworkDirectory;
import business.Order.MasterOrderCatalog;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Role.Role;
import business.Role.SystemAdminRole;
import business.Vaccine.BatchDirectory;
import business.Vaccine.VaccineTypeDirectory;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class EcoSystem extends Organization{
    
     private static EcoSystem business;
     private MasterOrderCatalog masterOrderCatalog;
    private StateNetworkDirectory stateNetworkDirectory;
    private VaccineTypeDirectory vaccineDirectory;
    private BatchDirectory batchDirectory;
    private DiseaseDirectory diseaseDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private OrganizationDirectory organizationDirectory;
    

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        stateNetworkDirectory = new StateNetworkDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        vaccineDirectory = new VaccineTypeDirectory();
        diseaseDirectory = new DiseaseDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        batchDirectory = new BatchDirectory();
    }
 
   
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (StateNetwork network : stateNetworkDirectory.getStateNetwork()) {
            
            

        }

        return true;
    }
    
    
     public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public VaccineTypeDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineTypeDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDirectory;
    }

    public void setDiseaseDirectory(DiseaseDirectory diseaseDirectory) {
        this.diseaseDirectory = diseaseDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
  public StateNetworkDirectory getStateNetworkDirectory() {
        return stateNetworkDirectory;
    }

    public void setStateNetworkDirectory(StateNetworkDirectory stateNetworkDirectory) {
        this.stateNetworkDirectory = stateNetworkDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public BatchDirectory getBatchDirectory() {
        return batchDirectory;
    }

    public void setBatchDirectory(BatchDirectory batchDirectory) {
        this.batchDirectory = batchDirectory;
    }
    
    


  

  /*  public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }*/

    public double totalPopulation()
    {
    double population = 0;
    for (StateNetwork network : stateNetworkDirectory.getStateNetwork()) {
         population = population + network.getState().getPopulation();
    }
    return population;
    }
    
    public float totalPercentage(double totalPopulation, String stateName)
    {
    float percentage = 0;
    for (StateNetwork network : stateNetworkDirectory.getStateNetwork()) {
        if(network.getState().getName().equals(stateName))
        {
         percentage = (float) (((network.getState().getPopulation())/(totalPopulation))*100);
         return percentage;
        }
         
    }
         return 0;
    }
  
    
    
}
