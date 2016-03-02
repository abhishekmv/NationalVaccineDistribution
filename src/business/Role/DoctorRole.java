/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.SiteEnterprise;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Sites.Doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author Abhishek
 */
public class DoctorRole extends Role{

     public DoctorRole()
    {
    
        super(RoleType.DoctorRole.getValue());
    
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account, (SiteEnterprise)enterprise,(DoctorOrganization)organization,system);
    }
    
}
