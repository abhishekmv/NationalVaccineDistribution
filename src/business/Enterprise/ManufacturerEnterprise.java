/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Order.Order;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManufacturerEnterprise extends Enterprise{
    
    private ArrayList<Order> orders;
    private String isEnrolled;
    
     public ManufacturerEnterprise(String name) {
        super(name, EnterpriseType.Manufacturer);
        orders = new ArrayList<>();
         isEnrolled = "NO";
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getIsEnrolled() {
        return isEnrolled;
    }

    public void setIsEnrolled(String isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

     
     
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
