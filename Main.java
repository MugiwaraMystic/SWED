import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("1", "John Doe", "john.doe@example.com", "Email");
        Website website = new Website("1", "https://example.com");
        Subscription subscription = new Subscription("1", "1", "1", "Daily", "Email");

        user.registerWebsite(subscription);

        List<Subscription> subscriptions = new ArrayList<>();
        subscriptions.add(subscription);

        UpdateChecker updateChecker = new UpdateChecker("1", 24);
        updateChecker.checkForUpdates(subscriptions);
    }
}
