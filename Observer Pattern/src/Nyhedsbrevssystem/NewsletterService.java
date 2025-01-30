package Nyhedsbrevssystem;

import java.util.ArrayList;
import java.util.List;

public class NewsletterService implements Subjekt {
    private List<Observer> observers = new ArrayList();
    private List<Newsletter> newsletters = new ArrayList();

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o))
            observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("der bliver givet besked til observerene");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void addNewsletter(Newsletter n) {
        if (!newsletters.contains(n)) {
            newsletters.add(n);
            System.out.println("nu er der blevet addet et newsletter");
            notifyObservers();
        }
    }

    public List getNewsletters() {
        return newsletters;
    }
}

