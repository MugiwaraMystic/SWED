package service;

public class NotificationService {

    public void sendEmailNotification(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }

    public void sendSmsNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    public void sendPushNotification(String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}
