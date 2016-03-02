/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

/**
 *
 * @author Abhishek
 */
public class VitalSign {
    
    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weight;
    
  //  private String healthStatus;
    
    public void setRespiratoryRate(float respiratoryRate)
    {
        this.respiratoryRate = respiratoryRate;
    
    }

    public float getRespiratoryRate()
    {
        return respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    
    }
    
    
    /*public String getHealthStatus(int age) {
        
       this.healthStatus = "Abnormal";
       
        if ((age>= 1.0f && age<=3.0f) && (this.respiratoryRate >= 20.0f && this.respiratoryRate <= 30.0f) && (this.heartRate >=80.0f && this.heartRate<=130.0f)  && (this.systolicBloodPressure >=80.0f && this.systolicBloodPressure<=110.0f) && (this.weight >= 22.0f && this.weight<=30.0f )) 
        {
            this.healthStatus = "Normal";
            return this.healthStatus;
        }
        else if((age>= 4.0f && age<=5.0f) && (this.respiratoryRate >= 20.0f && this.respiratoryRate <= 30.0f) && (this.heartRate >=80.0f && this.heartRate<=120.0f)  && (this.systolicBloodPressure >=80.0f && this.systolicBloodPressure<=110.0f) && (this.weight >= 31.0f && this.weight<=40.0f))
        {
            this.healthStatus = "Normal";
            return this.healthStatus;
        }
        else if((age>= 6.0f && age<=12.0f) && (this.respiratoryRate >= 20.0f && this.respiratoryRate <= 30.0f) && (this.heartRate >=70.0f && this.heartRate<=110.0f)  && (this.systolicBloodPressure >=80.0f && this.systolicBloodPressure<=120.0f) && (this.weight >= 41.0f && this.weight<=92.0f))
        {
            this.healthStatus = "Normal";
            return this.healthStatus;
        }
        else if((age>= 13.0f) && (this.respiratoryRate >= 12.0f && this.respiratoryRate <= 20.0f) && (this.heartRate >=55.0f && this.heartRate<=105.0f)  && (this.systolicBloodPressure >=110.0f && this.systolicBloodPressure<=120.0f) && (this.weight >= 110.0f ))
        {
            this.healthStatus = "Normal";
            return this.healthStatus;
        }
        return this.healthStatus;
    }*/
   
   

