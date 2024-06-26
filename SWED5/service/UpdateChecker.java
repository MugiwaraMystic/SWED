package service;

import observer.Subject;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UpdateChecker implements Subject {
    private static final Random random = new Random();
    private final List<Observer> observers = new ArrayList<>();

    public boolean checkForUpdates(String url) {
        // Simulate a change in update status for the website
        boolean updateDetected = random.nextBoolean();
        if (updateDetected) {
            notifyObservers("Update detected on " + url);
        }
        return updateDetected;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

   
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

  
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
