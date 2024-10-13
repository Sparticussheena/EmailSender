package org.vz;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    public static void sendEmail(String to, String subject, String messageText) {
        // Sender's email ID
        String from = "sendsayeedur@gmail.com"; // Replace with your email

        // Setup mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP server
        properties.put("mail.smtp.port", "25"); // Use port 25
        properties.put("mail.smtp.auth", "false"); // No authentication
        properties.put("mail.smtp.starttls.enable", "false"); // Disable TLS

        // Get the Session object without authentication
        Session session = Session.getInstance(properties);

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // Set From field
            message.setFrom(new InternetAddress(from));

            // Set To field
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set Subject
            message.setSubject(subject);

            // Set the actual message
            message.setText(messageText);

            // Send message
            Transport.send(message);

            System.out.println("Email sent successfully to " + to);

        } catch (MessagingException e) {
            e.printStackTrace(); // Print the full stack trace for debugging
        }
    }
}
