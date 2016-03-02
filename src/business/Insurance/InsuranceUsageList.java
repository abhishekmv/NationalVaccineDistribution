/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Insurance;

/**
 *
 * @author Abhishek
 */
public class InsuranceUsageList {
    
    private float amount;
    private String date;
    private static int count = 1;
    private String iuid;
    
    public InsuranceUsageList()
    {
       iuid = String.valueOf(count++);
    
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIuid() {
        return iuid;
    }

    public void setIuid(String iuid) {
        this.iuid = iuid;
    }
    
    @Override
    public String toString()
    {
        return iuid;
    
    }
    
}
