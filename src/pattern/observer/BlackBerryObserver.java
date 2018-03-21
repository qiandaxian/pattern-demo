package pattern.observer;

public class BlackBerryObserver implements Observer {
    @Override
    public void update(String json) {
        System.out.println("黑莓设备接收到通知："+json);
    }
}
