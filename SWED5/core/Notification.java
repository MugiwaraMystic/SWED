package core;

import observer.Observer;
import service.NotificationService;

import java.time.LocalDateTime;

public class Notification implements Observer {
    private static int counter = 1;
    private int notificationId;
    private Subscription subscription;
    private LocalDateTime timestamp;
    private String message;
    private NotificationService notificationService;

    public Notification(Subscription subscription) {
        this.notificationId = counter++;
        this.subscription = subscription;
        this.notificationService = new NotificationService();
    }

    @Override
    public void update(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        sendNotification();
    }

    public void sendNotification() {
        String recipient = subscription.getUser().getEmail();
        switch (subscription.getCommunicationChannel()) {
            case "email":
                notificationService.sendEmailNotification(message, recipient);
                break;
            case "sms":
                notificationService.sendSmsNotification(message, recipient);
                break;
            case "push":
                notificationService.sendPushNotification(message, recipient);
                break;
            default:
                System.out.println("Unknown communication channel: " + subscription.getCommunicationChannel());
        }
    }

    // Getters and setters
    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

