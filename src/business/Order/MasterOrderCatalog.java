/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class MasterOrderCatalog {
    
    
     private ArrayList<Order> orderCatalog ; 
   
    
    public MasterOrderCatalog()
    {
    
        orderCatalog = new ArrayList<Order>();
    
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

   
    
    public Order addOrder(Order o)
    {
    
        orderCatalog.add(o);
        return o;
    }
    
}
