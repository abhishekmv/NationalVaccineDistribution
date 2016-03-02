/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ClinicEnterprise  extends Enterprise{
    
     public ClinicEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Clinic);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
