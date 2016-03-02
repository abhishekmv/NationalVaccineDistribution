/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Distributor.Warehouse;

import business.Order.Order;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class DistributorEnterprise extends Enterprise{
    
    private ArrayList <Warehouse> warehouseList;
    private ArrayList<Order> orderList;
    
    
    
     public DistributorEnterprise(String name) {
        super(name, EnterpriseType.Distributor);
        warehouseList = new ArrayList<>();
        orderList = new ArrayList<>();
        
    }

    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(ArrayList<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

 
    
     
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
