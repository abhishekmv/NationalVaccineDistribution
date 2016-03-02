/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Doctor;

import business.Patient.EncounterDirectory;
import business.Person.Person;

/**
 *
 * @author Abhishek
 */
public class Doctor extends Person{
    
    private String qualification;
    private EncounterDirectory encounterDirectory;
  
    
    public Doctor()
    {
        encounterDirectory = new EncounterDirectory();
    
    }

    public EncounterDirectory getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(EncounterDirectory encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }

    
    
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    
    
}
