package level1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spam = new JButton("Send Spam");
	JTextField text = new JTextField(100);
	JTextField Email = new JTextField(25);
	JTextField Amount = new JTextField("Amount (of spam)");
	static final String FAKE_USERNAME = "mrmr79408@gmail.com";
	static final String FAKE_PASSWORD = "password987654321";
	String AmountS;
	int AmountI;
	String message;
	String email;
	String sub = "Spam";
	Boolean sendstat;

	public static void main(String[] args) {
		Spamalot spam = new Spamalot();
		spam.Start();
	}

	void Start() {
		text.setText("Message");
		Email.setText("Email");
		frame.add(panel);
		panel.add(spam);
		panel.add(text);
		panel.add(Email);
		panel.add(Amount);

		spam.addActionListener(this);

		frame.pack();
		frame.setVisible(true);

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AmountS = Amount.getText();
		email = Email.getText();
		message = text.getText();
		AmountI = Integer.parseInt(AmountS);
		for (int i = 0; i < AmountI; i++) {
			sendstat = sendSpam(email, sub, message);
		}
		if (sendstat == true) {
			panel.setBackground(Color.green);

		} else {
			panel.setBackground(Color.red);

		}
	}

}
