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
public class VitalSignHistory {
    
    private ArrayList <VitalSign> history;
   // private Patient patient;
    
    public VitalSignHistory()
    {
        history = new ArrayList();
      //  this.patient = patient;
        
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
     public VitalSign createAndAddPatientVitalSign()
    {
    
        VitalSign patientVitalSign = new VitalSign();
        history.add(patientVitalSign);
        return patientVitalSign;
    
    }
    
    public void deletePatientVitalSign(VitalSign patientVitalSign)
    {
       history.remove(patientVitalSign);
    }
    
}
