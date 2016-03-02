/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Abhishek
 */
public class Utility {
    
    public static boolean validateTxtFieldsForPhoneNumber(JTextField textField)
    {
        Pattern patternContactNumber = Pattern.compile("\\d{10}");
        Matcher matcher = patternContactNumber.matcher(textField.getText().trim());
        return matcher.matches();
    }
    
    public static boolean validateTxtFieldsForZipCode(JTextField textField)
    {
        Pattern patternContactNumber = Pattern.compile("\\d{5}");
        Matcher matcher = patternContactNumber.matcher(textField.getText().trim());
        return matcher.matches();
    }
    
    public static boolean validateTxtFieldsForSSN(JTextField textField)
    {
        Pattern patternContactNumber = Pattern.compile("\\d{9}");
        Matcher matcher = patternContactNumber.matcher(textField.getText().trim());
        return matcher.matches();
    }
    
    public static boolean validateTxtFieldsForEmailId(JTextField textField)
    {
        try
        {
        String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Boolean flag = textField.getText().trim().matches(emailPattern);
        return flag;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
}
