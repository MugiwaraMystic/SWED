public class User {
    private String userID;
    private String name;
    private String email;
    private String preferredChannel;

    public User(String userID, String name, String email, String preferredChannel) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.preferredChannel = preferredChannel;
    }

    public void registerWebsite(Subscription subscription) {
        // Implementation for registering a website
    }

    public void modifySubscription(Subscription subscription) {
        // Implementation for modifying a subscription
    }

    public void cancelSubscription(Subscription subscription) {
        // Implementation for canceling a subscription
    }

    // Getters and Setters
}
