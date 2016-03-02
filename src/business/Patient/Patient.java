/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import business.Insurance.Insurance;
import business.Person.Person;

/**
 *
 * @author Abhishek
 */
public class Patient extends Person{
    
     private EncounterDirectory encounterDirectory;
     private VitalSignHistory vitalSignHistory;
     private Insurance insurance;
     
     public Patient()
     {
         encounterDirectory = new EncounterDirectory();
         vitalSignHistory = new VitalSignHistory();
         insurance = new Insurance();
     
     }

    public EncounterDirectory getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(EncounterDirectory encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
     
     
    
    
}
