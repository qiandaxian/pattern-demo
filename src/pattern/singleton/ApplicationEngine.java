package pattern.singleton;

public class ApplicationEngine {
    private ApplicationEngine applicationEngine = null;
    //私有的构造方法
    private ApplicationEngine(){}

    public ApplicationEngine getApplicationEngine(){
        if(applicationEngine==null){
            new ApplicationEngine();
        }
        return applicationEngine;
    }
}
