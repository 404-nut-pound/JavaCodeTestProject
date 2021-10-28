package testpackage;

import java.time.LocalDateTime;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {

	public static void main(String[] args) {
		Properties prop = new Properties(); 
		prop.put("mail.smtp.host", "smtp-mail.outlook.com");
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.transport.protocol", "smtp");
		prop.put("mail.smtp.ssl.trust", "smtp-mail.outlook.com");
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		String[] receiver = {"hskim@saltlux.com"};
		
		System.out.println("메일 전송 시작");
		
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() { 
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() { 
				return new javax.mail.PasswordAuthentication("kb_transfer@saltlux.com", "saltlux123!"); 
			} 
		});
		
		MimeMessage mimeMessage = new MimeMessage(session);
		try {
			mimeMessage.setFrom(new InternetAddress("kb_transfer@saltlux.com")); //보내는 사람
			if(receiver.length > 1) {
    			InternetAddress[] toAddr = new InternetAddress[receiver.length];
    			int addrIdx = 0;
    			for(String addr : receiver) {
    				toAddr[addrIdx] = new InternetAddress(addr);
    				addrIdx++;
    			}
    			mimeMessage.setRecipients(Message.RecipientType.TO, toAddr);
    		}else if(receiver.length == 1){
    			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver[0]));
    		}else {
    			return;
    		}
			mimeMessage.setSentDate(new java.util.Date());
			mimeMessage.setSubject("[KB] 메일 전송 테스트 제목 " + LocalDateTime.now());
			mimeMessage.setText("메일 전송 테스트 내용", "UTF-8", "html");
			
			Transport.send(mimeMessage);
			
			System.out.println("메일 전송 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
