package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import core.Subscription;
import core.User;

public class Main {
    private static final String[] WEBSITES = {
    		"reddit.com",
            "Youtube.com",
            "Twitter.com",
            "Discord.com",
            "Gmail.com"
    };

    private static final String[] FREQUENCIES = {
            "Hourly","daily", "weekly", "monthly"
    };

    private static final String[] COMMUNICATION_CHANNELS = {
            "email", "sms", "push"
    };

    private static final String[] NAMES = {
            "John Smith", "Jane Doe", "Alice Johnson", "Robert Brown", "Michael Davis",
            "Mary Wilson", "Patricia Taylor", "Jennifer Anderson", "Linda Thomas", "Elizabeth Jackson"
    };

    public static void main(String[] args) {
        Random random = new Random();

        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            String name = NAMES[random.nextInt(NAMES.length)];
            User user = new User(i, name, name.replace(" ", "").toLowerCase() + "@example.com");
            users.add(user);

            int numberOfSubscriptions = random.nextInt(3) + 1;
            for (int j = 0; j < numberOfSubscriptions; j++) {
                String url = WEBSITES[random.nextInt(WEBSITES.length)];
                String frequency = FREQUENCIES[random.nextInt(FREQUENCIES.length)];
                String communicationChannel = COMMUNICATION_CHANNELS[random.nextInt(COMMUNICATION_CHANNELS.length)];

                user.registerWebsite(url, frequency, communicationChannel);
            }
        }

        for (User user : users) {
            System.out.println("Checking updates for user: " + user.getName());
            for (Subscription subscription : user.getSubscriptions()) {
                subscription.checkForUpdates();
            }
            System.out.println();
        }
    }
}
