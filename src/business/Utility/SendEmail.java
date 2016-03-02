/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Utility;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Abhishek
 */
public class SendEmail {
    
    public static boolean SendEmail(String rec, String sub,String mess)
        {
            String mailBody=mess;
            String mailRecepient=rec;
            String mailSubject=sub;
 
		final String username = "abhishekmv.91";
                //Change Password
		final String password = "abhishek@123";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() 
                  {
                         @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("abhishekmv.91@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(mailRecepient));
			message.setSubject(mailSubject);
			message.setText(mailBody);
 
			Transport.send(message);
 
			return true;
 
		} catch (MessagingException e)
                {
                        return false;
		}
	}
    
}
