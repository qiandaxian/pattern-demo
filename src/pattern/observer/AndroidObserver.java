package pattern.observer;



public class AndroidObserver implements Observer {

    @Override
    public void update(String json) {
        System.out.println("安卓设备接收到通知："+json);
    }
}
