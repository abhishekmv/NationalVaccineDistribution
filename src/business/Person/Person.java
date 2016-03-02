/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import business.Insurance.Insurance;

/**
 *
 * @author Abhishek
 */
public class Person {
    
    
    private String firstName;
    private String lastName;
    private String emailid;
    private Address address;
    private String dob;
    private double contactNo;
    private double ssn;
    private static int count = 0;
    private int pid;
    private String gender;
    private Insurance insurance;
    private String qualification;
    
    
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static final String OTHERS = "OTHERS";
    
    public Person()
    {
        count++;
        pid = count;
        address = new Address();
        insurance = new Insurance();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public int getPid() {
        return pid;
    }

    public double getContactNo() {
        return contactNo;
    }

    public void setContactNo(double contactNo) {
        this.contactNo = contactNo;
    }

    public double getSsn() {
        return ssn;
    }

    public void setSsn(double ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

     
    
    
   
    @Override
    public String toString()
    {
    
        return firstName;
    }
    
    
    
    
}
