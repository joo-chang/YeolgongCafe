package Network;

import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JApplet;

public class Mail {
	public static void mail(String email,String confirm_number) {
		String host="smtp.naver.com";
		final String user = "dudqls1441@naver.com"; //�߽����� ���ϰ����� ��й�ȣ ����
		final String password = "choco8421!";
		System.out.println(email+confirm_number);
		Properties prop = new Properties(); //property�� smtp ���� ������ ����
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.auth","true");
		prop.put("mal.smtp.ssl.enable","true");
		prop.put("mail.smtp.ssl.trust",host);
		
		Session session=Session.getDefaultInstance(prop, new javax.mail.Authenticator(){ //SMTP ���� ������ ����� ������ ������� Session Ŭ������ �ν��Ͻ��� �����Ѵ�.
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(user, password);
			}
		});
		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("������ȣ �߼�");
			message.setText("Studycafe ������ȣ�� "+confirm_number+" �Դϴ�");
			Transport.send(message);
			System.out.println("�޼��� ���� �Ϸ�");
			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
