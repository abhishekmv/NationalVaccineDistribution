/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class EnterpriseDirectory {
    
    
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Site){
          enterprise = new SiteEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Clinic)
        {
        
            enterprise = new ClinicEnterprise(name);
            enterpriseList.add(enterprise);
        
        }
        else if(type == Enterprise.EnterpriseType.Distributor)
        {
        
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        
        }
        else if(type == Enterprise.EnterpriseType.Manufacturer)
        {
        
            enterprise = new ManufacturerEnterprise(name);
            enterpriseList.add(enterprise);
        
        }
       
        else if(type == Enterprise.EnterpriseType.Provider)
        {
        
            enterprise = new ProviderEnterprise(name);
            enterpriseList.add(enterprise);
        
        }
        else if(type == Enterprise.EnterpriseType.PHD)
        {
        
            enterprise = new PHDEnterprise(name);
            enterpriseList.add(enterprise);
        
        }
        return enterprise;
    }
    
     public boolean checkExisting(String name,Enterprise.EnterpriseType type){
         
      boolean flag = false;
         for(Enterprise e : enterpriseList){
            if(e.getName().equals(name) && e.getEnterpriseType().equals(type)){
                return true;
            }
            
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Distributor)){
                flag = true;
            }

        }
        
        if(flag == true && type.equals(Enterprise.EnterpriseType.Distributor)){
            return true;
        }
        return false;
     }
}
