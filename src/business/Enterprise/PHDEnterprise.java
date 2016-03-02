/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Network.CityNetworkDirectory;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PHDEnterprise extends Enterprise{
    
    private EnterpriseDirectory enterpriseDirectory;
    private String stateName;
    private CityNetworkDirectory cityNetworkDirectory;
    
     public PHDEnterprise(String name) {
        super(name,EnterpriseType.PHD);
        enterpriseDirectory = new EnterpriseDirectory();
        cityNetworkDirectory = new CityNetworkDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public CityNetworkDirectory getCityNetworkDirectory() {
        return cityNetworkDirectory;
    }

    public void setCityNetworkDirectory(CityNetworkDirectory cityNetworkDirectory) {
        this.cityNetworkDirectory = cityNetworkDirectory;
    }
     
     

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
