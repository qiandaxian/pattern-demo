package pattern.state;

public class LoginoutCommand implements CommandState {

    @Override
    public void handle(WebCommand webCommand) {
        System.out.println("登出handle");
        System.out.println("命令："+webCommand.getCommand());
        System.out.println("参数："+webCommand.getParam());
    }
}
