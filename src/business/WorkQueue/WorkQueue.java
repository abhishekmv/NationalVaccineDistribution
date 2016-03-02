/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class WorkQueue {
    
     private ArrayList<WorkRequest> workRequestList;
     private ArrayList<PatientBillPaymentWorkRequest> patientBillPaymentWorkRequest;
     
    public WorkQueue() {
        workRequestList = new ArrayList<>();
        patientBillPaymentWorkRequest = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<PatientBillPaymentWorkRequest> getPatientBillPaymentWorkRequest() {
        return patientBillPaymentWorkRequest;
    }

    public void setPatientBillPaymentWorkRequest(ArrayList<PatientBillPaymentWorkRequest> patientBillPaymentWorkRequest) {
        this.patientBillPaymentWorkRequest = patientBillPaymentWorkRequest;
    }
    
    
    
}
