/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class EncounterDirectory {
    
    private ArrayList<Encounter> encounterList;

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    
    public Encounter createEncounter(){
        Encounter e = new Encounter();
        encounterList.add(e);
        return e;
    }
    
    
    
    
    
    
}
