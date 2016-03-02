/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class VaccineTypeDirectory {
    
    private ArrayList<VaccineType> vaccineList;
   // private static int count = 0;
    
    public VaccineTypeDirectory()
    {
    
        vaccineList = new ArrayList<>();
    
    }

    public ArrayList<VaccineType> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<VaccineType> vaccineList) {
        this.vaccineList = vaccineList;
    }

  
    
    public void deleteVaccine(VaccineType v)
    {
    
        vaccineList.remove(v);
    
    }
    
    public VaccineType createAndAddVaccine()
    {
    
        VaccineType vac = new VaccineType();
        vaccineList.add(vac);
        return vac;

    }
    
     public VaccineType searchVaccine(int id) {
        //ArrayList<Vaccine> result = new ArrayList<Vaccine>();
        for(VaccineType v : vaccineList) {
            if(v.getVaccid() == id) {
                return v;
            }
        }
        return null;
    }
    
    
}
