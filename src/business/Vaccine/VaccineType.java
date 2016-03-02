/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Vaccine;

import business.Disease.Disease;
import business.State.State;
import java.util.ArrayList;



/**
 *
 * @author Abhishek
 */
public class VaccineType {
    
    
   private int vaccid ; 
   private static int count =100;
   private String vaccineTypeName;
   private String status;
   public static final String ACTIVE = "ACTIVE";
   public static final String DEACTIVE = "DE-ACTIVE";
   
    public static final String FEDERALLYFUNDED = "FEDERALLY FUNDED";
    public static final String NONFUNDED = "NON FUNDED";
    private String fundingInfo ;
    private Disease disease;
    private ArrayList<String> stateFundedList;
    
   
   
   public VaccineType()
   {
       
       vaccid = count++;
       stateFundedList = new ArrayList<>();
   
   }

    public int getVaccid() {
        return vaccid;
    }

    public void setVaccid(int vaccid) {
        this.vaccid = vaccid;
    }

    public String getVaccineTypeName() {
        return vaccineTypeName;
    }

    public void setVaccineTypeName(String vaccineTypeName) {
        this.vaccineTypeName = vaccineTypeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFundingInfo() {
        return fundingInfo;
    }

    public void setFundingInfo(String fundingInfo) {
        this.fundingInfo = fundingInfo;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public ArrayList<String> getStateFundedList() {
        return stateFundedList;
    }

    public void setStateFundedList(ArrayList<String> stateFundedList) {
        this.stateFundedList = stateFundedList;
    }

    

   

    @Override
    public String toString() {
        return vaccineTypeName ;
    }
    
}
