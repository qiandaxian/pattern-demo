package pattern.observer;

import java.util.Observer;

public interface Subject {
    void register(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
