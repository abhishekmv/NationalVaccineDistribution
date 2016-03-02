/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Enterprise.SiteEnterprise;
import business.PaymentTransaction.BankAccount;
import business.Person.Person;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class PatientBillPaymentWorkRequest {
    
    private BankAccount fromSiteAccount;
    private BankAccount toPHDAccount;
    private Date date;
    private SiteEnterprise siteEnterprise;
    private Person patient;
    private String status;
    private float billAmount;
    
    public PatientBillPaymentWorkRequest() {
        Calendar cal = Calendar.getInstance();
        date = cal.getTime();
    }

    public BankAccount getFromSiteAccount() {
        return fromSiteAccount;
    }

    public void setFromSiteAccount(BankAccount fromSiteAccount) {
        this.fromSiteAccount = fromSiteAccount;
    }

    public BankAccount getToPHDAccount() {
        return toPHDAccount;
    }

    public void setToPHDAccount(BankAccount toPHDAccount) {
        this.toPHDAccount = toPHDAccount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public SiteEnterprise getSiteEnterprise() {
        return siteEnterprise;
    }

    public void setSiteEnterprise(SiteEnterprise siteEnterprise) {
        this.siteEnterprise = siteEnterprise;
    }

    public Person getPatient() {
        return patient;
    }

    public void setPatient(Person patient) {
        this.patient = patient;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }
    
    
    
    @Override
    public String toString()
    {
        return status;
    
    }
    
    
    
}
