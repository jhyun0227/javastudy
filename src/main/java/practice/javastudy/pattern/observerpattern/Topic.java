package practice.javastudy.pattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers;
    private String message;

    public Topic() {
        observers = new ArrayList<>();
        message = "";
    }

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message sended to Topic: = " + msg);
        this.message = msg;
        notifyObserver();
    }
}
