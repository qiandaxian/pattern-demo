package pattern.observer;


public interface Subject {
    void register(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver(String json);
}
