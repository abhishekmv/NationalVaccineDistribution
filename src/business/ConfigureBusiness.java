/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;



import business.Person.Person;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author Abhishek
 */
public class ConfigureBusiness {
    

   
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //check if this works 
        Person person = system.getPersonDirectory().createPerson();
            person.setFirstName("Lord");
            person.setLastName("Shiva");
            person.setContactNo(1234567890);
             person.setDob("Nov 3, 2014");
            person.setEmailid("abimnm@gmail.com");
            person.setSsn(123456789);
            person.getAddress().setCity("Boston");
            person.getAddress().setState("MA");
            person.getAddress().setStreetName("Huntington Avenue");
            person.getAddress().setZipcode(02120);
           person.setGender(Person.MALE);
        
        UserAccount ua = new UserAccount();
        ua.setUserName("sysadmin");
        ua.setPassword("sysadmin");
        ua.setStatus(UserAccount.ACTIVE);
        ua.setRole(new SystemAdminRole());
        ua.setPerson(person);
        system.getUserAccountDirectory().getUserAccountList().add(ua);
        return system;
    }
    
}
