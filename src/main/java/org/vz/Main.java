package org.vz;

public class Main {

    public static void main(String[] args) {
        // Example usage
        String to = "sendsayeedur@gmail.com";
        String subject = "Test Email";
        String messageText = "Hello, this is a test email sent from a Java program without authentication!";

        // Calling the sendEmail method from EmailSender class
        EmailSender.sendEmail(to, subject, messageText);
    }
}
