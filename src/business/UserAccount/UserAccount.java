/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Patient.EncounterDirectory;
import business.PaymentTransaction.BankAccount;
import business.Person.Person;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author Abhishek
 */
public class UserAccount {
    
    
    
    private static  int count = 0;
    private int uId;
    private String userName;
    private String password;
    private Role role;
    private Person person;
    private EncounterDirectory encounterDirectory;
    private String status;
    private WorkQueue workQueue;
    public static final String ACTIVE = "ACTIVE";
    public static final String DEACTIVE = "DEACTIVE";
    private BankAccount accountNumber;
    
    
    public UserAccount()
    {
            count++;
            uId = count;
            workQueue = new WorkQueue();
            accountNumber = new BankAccount(String.valueOf(count));
            person = new Person();
            encounterDirectory = new EncounterDirectory();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EncounterDirectory getEncounterDirectory() {
        return encounterDirectory;
    }

    public void setEncounterDirectory(EncounterDirectory encounterDirectory) {
        this.encounterDirectory = encounterDirectory;
    }

 

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BankAccount getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BankAccount accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
    

    @Override
    public String toString()
    {
    
        return userName;
    }
    
}
