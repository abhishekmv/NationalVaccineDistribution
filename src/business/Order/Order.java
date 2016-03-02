/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;


import business.Enterprise.SiteEnterprise;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class Order {
    
    private ArrayList<OrderItem> orderItemList;
    private String orderNumber;
    private static int count =0;
    private Date timeStamp ;
    private SiteEnterprise site;
    private float billAmount;
     private String status;
     private String isPaid;
     private String providerPaymentStatus;
     private String PHDpaymentStatus;
     private String CDCPaymentStatus;
    
    public Order()
    {
        count++;
        orderNumber = String.valueOf(count);
        orderItemList = new ArrayList<OrderItem>();
        isPaid = "NO";
        providerPaymentStatus ="NO";
        PHDpaymentStatus = "NO";
        CDCPaymentStatus = "NO";
      //  timeStamp = new SimpleDateFormat("MM/dd/yyyy-HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public SiteEnterprise getSite() {
        return site;
    }

    public void setSite(SiteEnterprise site) {
        this.site = site;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    public String getProviderPaymentStatus() {
        return providerPaymentStatus;
    }

    public void setProviderPaymentStatus(String providerPaymentStatus) {
        this.providerPaymentStatus = providerPaymentStatus;
    }

    public String getPHDpaymentStatus() {
        return PHDpaymentStatus;
    }

    public void setPHDpaymentStatus(String PHDpaymentStatus) {
        this.PHDpaymentStatus = PHDpaymentStatus;
    }

    public String getCDCPaymentStatus() {
        return CDCPaymentStatus;
    }

    public void setCDCPaymentStatus(String CDCPaymentStatus) {
        this.CDCPaymentStatus = CDCPaymentStatus;
    }
    


    
     public void removeOrderItem(OrderItem o)
    {
       // int avail = o.getProduct().getAvail();
       // int newavail = avail + o.getQuantity();
       // o.getProduct().setAvail(newavail);
        orderItemList.remove(o);
        
    }
    
    public OrderItem addOrderItem()
    {
    
        OrderItem o = new OrderItem();
       // o.setProduct(p);
       // o.setQuantity(quantity);
        orderItemList.add(o);
        return o;
    
    }
    
}
