package pattern.singleton;

public class ApplicationEngine {
    private static ApplicationEngine applicationEngine = null;
    //私有的构造方法
    private ApplicationEngine(){
        System.out.println("引擎初始化操作！");
    }

    public static ApplicationEngine getApplicationEngine(){
        if(applicationEngine==null){
            applicationEngine = new ApplicationEngine();
        }
        System.out.println("获取引擎实例");
        return applicationEngine;
    }

    public static void main(String[] args) {
        ApplicationEngine.getApplicationEngine();
        ApplicationEngine.getApplicationEngine();
        ApplicationEngine.getApplicationEngine();
        ApplicationEngine.getApplicationEngine();

    }
}
