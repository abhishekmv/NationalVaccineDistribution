/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Enterprise.Enterprise.EnterpriseType;
import business.Patient.EncounterDirectory;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class SiteEnterprise extends Enterprise{
    
    private String stateName;
    private String cityName;
    private EncounterDirectory encounterDirectory;
    
     public SiteEnterprise(String name) {
        super(name, EnterpriseType.Site);
        encounterDirectory = new EncounterDirectory();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public EncounterDirectory getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(EncounterDirectory encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }

    
    
     
     

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
