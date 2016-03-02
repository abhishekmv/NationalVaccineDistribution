/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Distributor;

import business.Vaccine.BatchDirectory;

/**
 *
 * @author Abhishek
 */
public class Warehouse {
    
    private String warehouseRegion;
    private String wareHouseID;
    private static int count = 10;
    
    public static final String NORTHEAST = "NORTHEAST";
    public static final String SOUTH = "SOUTH";
    public static final String MIDWEST = "MIDWEST";
    public static final String WEST = "WEST";
    private BatchDirectory batchDirectory;
    
    public Warehouse()
    {
        wareHouseID = String.valueOf(count++);
        batchDirectory = new BatchDirectory();
    
    }

    public String getWarehouseRegion() {
        return warehouseRegion;
    }

    public void setWarehouseRegion(String warehouseRegion) {
        this.warehouseRegion = warehouseRegion;
    }

    public BatchDirectory getBatchDirectory() {
        return batchDirectory;
    }

    public void setBatchDirectory(BatchDirectory batchDirectory) {
        this.batchDirectory = batchDirectory;
    }

    public String getWareHouseID() {
        return wareHouseID;
    }
    
    @Override
    public String toString()
    {
        return wareHouseID;
    
    }
    
    
    
}
