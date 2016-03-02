/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;


import business.Doctor.Doctor;

import business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    
     public PersonDirectory ()
    {
    
        personList = new ArrayList<>();
       
    
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

     public Person createPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    } 
    
    public void removePerson(Person p)
    {
    
            personList.remove(p);
    }
    
     
    
    public boolean checkExisting(double ssn){
        for(Person p : personList){
            if(p.getSsn()== ssn){
                return true;
            }
        }
         
        return false;
    }
}
