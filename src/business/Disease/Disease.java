/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Disease;

/**
 *
 * @author Abhishek
 */
public class Disease {
    
    private String diseaseName;
    private Symptom symptom;
    private static int count=0;
    private int did;
    public Disease()
    {
        count++;
        did = count;
        symptom = new Symptom();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    

    public int getDid() {
        return did;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }
    

    @Override 
    public String toString()
    {
    
        return diseaseName;
    }
    
}
