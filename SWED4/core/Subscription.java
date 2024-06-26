package core;

import java.util.ArrayList;
import java.util.List;

import service.UpdateChecker;

public class Subscription {
    private static int counter = 1;
    private int subscriptionId;
    private User user;
    private Website website;
    private String frequency;
    private String communicationChannel;
    private List<Notification> notifications;
    private UpdateChecker updateChecker;

    public Subscription(User user, Website website, String frequency, String communicationChannel) {
        this.subscriptionId = counter++;
        this.user = user;
        this.website = website;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
        this.notifications = new ArrayList<>();
        this.updateChecker = new UpdateChecker();
    }

    public void checkForUpdates() {
        boolean updateDetected = updateChecker.checkForUpdates(website.getUrl());
        if (updateDetected) {
            Notification notification = new Notification(this, "Update detected on " + website.getUrl());
            notifications.add(notification);
            notification.sendNotification();
        }
    }

    public void modifySubscription(String newFrequency, String newCommunicationChannel) {
        this.frequency = newFrequency;
        this.communicationChannel = newCommunicationChannel;
        System.out.println("Subscription modified: Frequency - " + newFrequency + ", Communication Channel - " + newCommunicationChannel);
    }

    // Getters and setters
    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(String communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
