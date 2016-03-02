/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.SiteEnterprise;
import business.Organization.Organization;
import business.Organization.PatientOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Patient.PatientWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class PatientRole extends Role{

     public PatientRole()
    {
    
        super(RoleType.PatientRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       return  new PatientWorkAreaJPanel(userProcessContainer,account);
    }
    
}
