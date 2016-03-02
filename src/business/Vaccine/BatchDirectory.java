/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Vaccine;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class BatchDirectory {
    
    private ArrayList<Batch> batchList;
    
    public BatchDirectory()
    {
    
        batchList = new ArrayList<>();
    
    }

    public ArrayList<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(ArrayList<Batch> batchList) {
        this.batchList = batchList;
    }
    
    public Batch createAndAddBatch(VaccineType vtype, String name, float price, Date mandate, Date exdate, int total,String vaccineName)
    {
    
        Batch batch = new Batch();
        batch.setAvailability(20);
        batch.setManufacturerInventoryStatus(batch.INSTOCK);
         batch.setBatchName(vaccineName);
        
        for(int i=1;i<=20;i++)
        {
        
            Vaccine vac = new Vaccine();
            vac.setVaccineBatchNo(batch.getBatchID());
            vac.setVaccineName(name);
            vac.setVaccineType(vtype);
            vac.setManufacturedDate(mandate);
            vac.setExpireDate(exdate);
            vac.setvPrice(price);
            vac.setTotalNumber(total);
            batch.getVaccineList().add(vac);
        
        }
    
        batchList.add(batch);
         return batch;
    }
    
    
    public boolean isVaccineAvailable(Vaccine v,int qty){
        
        //boolean flag = false;
        int count = 0;
        
        for(Batch batch : batchList){
            if(batch.getBatchName().equals(v.getVaccineName()) && batch.getManufacturerInventoryStatus().equals(Batch.INSTOCK)){
                count++;
            }
        }
        
        if(count >= qty){
            return true;
        }
        
        return false;
        
    }
    
    public ArrayList<Batch> getSellingVaccineBatch(Vaccine v,int qty){
        
        ArrayList<Batch> soldBatch = new ArrayList<>();
        int count = 0;
        
        for(Batch batch : batchList){
            if(batch.getBatchName().equals(v.getVaccineName()) && batch.getManufacturerInventoryStatus().equals(Batch.INSTOCK) && count < qty){
                soldBatch.add(batch);
                batch.setManufacturerInventoryStatus(Batch.SOLD);
                batch.setDistributorInventoryStatus(Batch.INSTOCK);
                count++;
            }
        }
        
        return soldBatch;
    }

    public ArrayList<Batch> getSiteSellingVaccineBatch(Vaccine v,int qty){
        
        ArrayList<Batch> soldBatch = new ArrayList<>();
        int count = 0;
        
        for(Batch batch : batchList){
            if(batch.getBatchName().equals(v.getVaccineName()) && batch.getDistributorInventoryStatus().equals(Batch.INSTOCK) && count < qty){
                soldBatch.add(batch);
                batch.setDistributorInventoryStatus(Batch.SOLD);
                count++;
            }
        }
        
        return soldBatch;
    }
    
    public boolean isVaccineAvailableAtDistributor(Vaccine v,int qty){
        
        //boolean flag = false;
        int count = 0;
        
        for(Batch batch : batchList){
            if(batch.getBatchName().equals(v.getVaccineName()) && batch.getDistributorInventoryStatus().equals(Batch.INSTOCK)){
                count++;
            }
        }
        
        if(count >= qty){
            return true;
        }
        
        return false;
        
    }
    
    
    
}
