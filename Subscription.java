public class Subscription {
    private String subscriptionID;
    private String userID;
    private String websiteID;
    private String notificationFrequency;
    private String preferredChannel;

    public Subscription(String subscriptionID, String userID, String websiteID, String notificationFrequency, String preferredChannel) {
        this.subscriptionID = subscriptionID;
        this.userID = userID;
        this.websiteID = websiteID;
        this.notificationFrequency = notificationFrequency;
        this.preferredChannel = preferredChannel;
    }

    public String getSubscriptionDetails() {
        // Implementation for getting subscription details
        return "Subscription ID: " + subscriptionID + ", User ID: " + userID + ", Website ID: " + websiteID + ", Notification Frequency: " + notificationFrequency + ", Preferred Channel: " + preferredChannel;
    }

    public void modifySubscription(String notificationFrequency, String preferredChannel) {
        this.notificationFrequency = notificationFrequency;
        this.preferredChannel = preferredChannel;
    }

    public void cancelSubscription() {
        // Implementation for canceling a subscription
    }

    // Getters and Setters
}
