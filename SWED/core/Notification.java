package core;

import java.time.LocalDateTime;

public class Notification {
    private static int counter = 1;
    private int notificationId;
    private Subscription subscription;
    private LocalDateTime timestamp;
    private String message;

    public Notification(Subscription subscription, String message) {
        this.notificationId = counter++;
        this.subscription = subscription;
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public void sendNotification() {
        // Placeholder for the actual notification sending logic
        System.out.println( message + " via " + subscription.getCommunicationChannel());
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

