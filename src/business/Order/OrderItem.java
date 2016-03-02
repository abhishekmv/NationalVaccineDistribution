/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Enterprise.ManufacturerEnterprise;
import business.Vaccine.Batch;
import business.Vaccine.Vaccine;
import business.Vaccine.VaccineType;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class OrderItem {
    
    
    private int batchQuantity;
    private ArrayList<Batch> batchList;
    private ManufacturerEnterprise manufacturer;
    private VaccineType vaccineType;
    private Vaccine vaccine;
    
    
    public OrderItem()
    {
    
        batchList = new ArrayList<>();
    }

    public int getBatchQuantity() {
        return batchQuantity;
    }

    public void setBatchQuantity(int batchQuantity) {
        this.batchQuantity = batchQuantity;
    }

    public ArrayList<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(ArrayList<Batch> batchList) {
        this.batchList = batchList;
    }

    public ManufacturerEnterprise getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerEnterprise manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VaccineType getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(VaccineType vaccineType) {
        this.vaccineType = vaccineType;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

  
    
   
    
}
