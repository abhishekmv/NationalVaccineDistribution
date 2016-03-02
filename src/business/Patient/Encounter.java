/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import business.UserAccount.UserAccount;
import business.Vaccine.Vaccine;
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class Encounter {
    
    
    private UserAccount doctorName;
    private UserAccount patientName;
    private String eid;
    private static int count = 0;
    private Vaccine vaccine;
    private String encounterDetails;
    private String encounterPlaceName;
    private String diseaseType;
    private Date encounterDate;
    private float encounterAmount;
    private int noOfDose;
    private VitalSign vitalSign;
    
    public Encounter()
    {
        eid = String.valueOf(count++);
        vitalSign = new VitalSign();
        Calendar cal = Calendar.getInstance();
        setEncounterDate(cal.getTime());
    }

    public UserAccount getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(UserAccount doctorName) {
        this.doctorName = doctorName;
    }

    public UserAccount getPatientName() {
        return patientName;
    }

    public void setPatientName(UserAccount patientName) {
        this.patientName = patientName;
    }

    public int getNoOfDose() {
        return noOfDose;
    }

    public void setNoOfDose(int noOfDose) {
        this.noOfDose = noOfDose;
    }

    

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public float getEncounterAmount() {
        return encounterAmount;
    }

    public void setEncounterAmount(float encounterAmount) {
        this.encounterAmount = encounterAmount;
    }

   

    public String getEncounterDetails() {
        return encounterDetails;
    }

    public void setEncounterDetails(String encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    public String getEncounterPlaceName() {
        return encounterPlaceName;
    }

    public void setEncounterPlaceName(String encounterPlaceName) {
        this.encounterPlaceName = encounterPlaceName;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(String diseaseType) {
        this.diseaseType = diseaseType;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

  

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    

    
   
    
    @Override
    public String toString()
    {
        return  eid;
    
    }
    
    
}
