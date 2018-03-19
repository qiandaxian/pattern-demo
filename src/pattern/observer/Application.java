package pattern.observer;

public class Application {
    public static void main(String[] args) {
        //观察者
        Observer ios = new IosAppObserver();
        Observer android = new AndroidObserver();
        //注册观察者到主题
        Subject subject = new PositionReceive();
        subject.register(ios);
        subject.register(android);

        subject.notifyAllObserver("设备更新了");

    }
}
