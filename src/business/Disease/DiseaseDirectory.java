/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class DiseaseDirectory {
    
    private ArrayList<Disease> diseaseList;
    
    public DiseaseDirectory()
    {
    
        diseaseList = new ArrayList<>();
    
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
    
    public Disease createAndAddDisease()
    {
            Disease d = new Disease();
            diseaseList.add(d);
            return d;
    
    
    }
   
      public boolean checkExisting(String name){
        for(Disease d : diseaseList){
            if(d.getDiseaseName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    
}
