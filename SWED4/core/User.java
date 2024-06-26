package core;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private List<Subscription> subscriptions;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.subscriptions = new ArrayList<>();
    }

    public void registerWebsite(String url, String frequency, String communicationChannel) {
        Website website = new Website(url);
        Subscription subscription = new Subscription(this, website, frequency, communicationChannel);
        subscriptions.add(subscription);
    }

    public void manageSubscription(int subscriptionId, String action, String newFrequency, String newCommunicationChannel) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getSubscriptionId() == subscriptionId) {
                if (action.equals("cancel")) {
                    subscriptions.remove(subscription);
                    break;
                } else if (action.equals("modify")) {
                    subscription.modifySubscription(newFrequency, newCommunicationChannel);
                }
            }
        }
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
