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
public class Batch {
    
    private String batchID;
    private static int count = 1;
    private ArrayList<Vaccine> vaccineList;
    private int totalQuantity = 20;
    private int availability;
    private String manufacturerInventoryStatus;
    private String distributorInventoryStatus;
    public static final String INSTOCK = "INSTOCK";
    public static final String SOLD = "SOLD";
    private String batchName;
    
    public Batch()
    {
        batchID = String.valueOf(count++);
        vaccineList = new ArrayList<>();
    
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Batch.count = count;
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getManufacturerInventoryStatus() {
        return manufacturerInventoryStatus;
    }

    public void setManufacturerInventoryStatus(String manufacturerInventoryStatus) {
        this.manufacturerInventoryStatus = manufacturerInventoryStatus;
    }

    public String getDistributorInventoryStatus() {
        return distributorInventoryStatus;
    }

    public void setDistributorInventoryStatus(String distributorInventoryStatus) {
        this.distributorInventoryStatus = distributorInventoryStatus;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    
    
    @Override
    public String toString()
    {
        return batchID;
    }
    
    
    
}
