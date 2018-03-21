package pattern.observer;

public class Application {
    public static void main(String[] args) {
        //观察者
        Observer ios = new IosAppObserver();
        Observer android = new AndroidObserver();
        Observer blackBerry = new BlackBerryObserver();
        //注册观察者到主题
        Subject subject = new PositionReceive();
        subject.register(ios);
        subject.register(android);
        subject.register(blackBerry);

        System.out.println("推送消息到观察者：你好，小朋友");
        subject.notifyAllObserver("你好，小朋友");
        //移除某个观察者
        System.out.println("移除一个观察者");
        subject.removeObserver(android);
        //再次通知
        System.out.println("推送消息到观察者：再见");
        subject.notifyAllObserver("再见");

    }
}
