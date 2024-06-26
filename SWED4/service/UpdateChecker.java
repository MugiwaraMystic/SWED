package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UpdateChecker {
    private static final Random random = new Random();
    private static final Map<String, Boolean> websiteUpdateStatus = new HashMap<>();

    public boolean checkForUpdates(String url) {
        // Simulate a change in update status for the website
        boolean updateDetected = random.nextBoolean();

        // Store the update status in the map
        websiteUpdateStatus.put(url, updateDetected);

        return updateDetected;
    }

    public boolean getUpdateStatus(String url) {
        // Return the current update status for the website
        return websiteUpdateStatus.getOrDefault(url, false);
    }
}
