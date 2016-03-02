/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Vaccine;

import java.util.Date;



/**
 *
 * @author Abhishek
 */
public class Vaccine {
    
    private String vaccineName;
    private int vid;
    private VaccineType vaccineType;
    private String vaccineBatchNo;
    private Date manufacturedDate;
    private Date expireDate;
    private int totalNumber;
  //private int noOfDose;
    private float vPrice;
    private static int count =0;

 // private Manufacturer manufacturer;
    
    public Vaccine()
    {
        count++;
        vid = count;
    
    }
    
    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

 

  /*  public int getNoOfDose() {
        return noOfDose;
    }

    public void setNoOfDose(int noOfDose) {
        this.noOfDose = noOfDose;
    }*/

    public float getvPrice() {
        return vPrice;
    }

    public void setvPrice(float vPrice) {
        this.vPrice = vPrice;
    }

    public int getVid() {
        return vid;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }
    
    
    
   
  /*  public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }*/

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getVaccineBatchNo() {
        return vaccineBatchNo;
    }

    public void setVaccineBatchNo(String vaccineBatchNo) {
        this.vaccineBatchNo = vaccineBatchNo;
    }

    @Override
    public String toString()
    {
            return vaccineName;
            

    }
    
}
