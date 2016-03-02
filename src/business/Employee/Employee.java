/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

import business.Person.Person;

/**
 *
 * @author Abhishek
 */
public class Employee extends Person{
    
    private int id;
    private static int count = 0;
   
    
    public Employee()
    {
        count++;
         id = count;
    }


    public int getId() {
        return id;
    }

  

     
    @Override
    public String toString()
    {
    
        return super.getFirstName();
    
    }
    
}
