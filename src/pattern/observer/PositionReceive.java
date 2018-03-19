package pattern.observer;


import java.util.ArrayList;
import java.util.List;

public class PositionReceive implements Subject {
    private List<Observer> observers = new ArrayList();


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String json) {
        observers.stream().forEach(observer -> observer.update(json));
    }
}
