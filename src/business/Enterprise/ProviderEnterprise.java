/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ProviderEnterprise extends Enterprise{
    
    private String stateName;
    private ArrayList<SiteEnterprise> siteList;
    
    public ProviderEnterprise(String name) {
        super(name, EnterpriseType.Provider);
        siteList = new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<SiteEnterprise> getSiteList() {
        return siteList;
    }

    public void setSiteList(ArrayList<SiteEnterprise> siteList) {
        this.siteList = siteList;
    }

   
    
    
    
}
