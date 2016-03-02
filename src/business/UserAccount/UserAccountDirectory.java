/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Person.Person;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class UserAccountDirectory {
    
    
     private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
        {
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password) && ua.getStatus().equals(UserAccount.ACTIVE)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
     public boolean checkIfUsernameIsUnique(String username){
        
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return true;
        }
    
        return false;
    }
    
    public boolean checkIfUsernameIsUnique(String username,ArrayList<UserAccount> accountList){
        if(accountList!=null)
        {
        for (UserAccount ua : accountList){
            if (ua.getUserName().equals(username))
                return true;
        }
    }
        return false;
    }
    
    
}
