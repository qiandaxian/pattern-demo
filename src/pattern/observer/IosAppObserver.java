package pattern.observer;



public class IosAppObserver implements Observer {

    @Override
    public void update(String json) {
        System.out.println("Ios设备接收到通知!");
        System.out.println("JSON:"+json);

    }
}
