/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Insurance;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class Insurance {
    
    private String insuranceCompanyName;
    private String policyTypeName;
    private Date policyStartDate;
    private Date policyEndDate;
    private float policyAmount;
    private float leftClaimAmount;
    private String policyID;
    private static int count = 50;
    private ArrayList<InsuranceUsageList> usageList;
    
    public Insurance()
    {
        policyID = String.valueOf(count++);
        usageList = new ArrayList<>();
    
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getPolicyTypeName() {
        return policyTypeName;
    }

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

   

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public float getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(float policyAmount) {
        this.policyAmount = policyAmount;
    }

    public float getLeftClaimAmount() {
        return leftClaimAmount;
    }

    public void setLeftClaimAmount(float amount) {
        
        this.leftClaimAmount = this.policyAmount-this.leftClaimAmount-amount;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }
    
     public ArrayList<InsuranceUsageList> getUsageList() {
        return usageList;
    }
     
     public InsuranceUsageList addAndCreateUsageList(){
        InsuranceUsageList iul = new InsuranceUsageList();
        usageList.add(iul);
        return iul;
    }
    
    
    
    @Override
    public String toString()
    {
    
        return policyID;
    }
    
}
