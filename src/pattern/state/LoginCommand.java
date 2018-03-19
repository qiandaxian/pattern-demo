package pattern.state;

public class LoginCommand implements CommandState {

    @Override
    public void handle(WebCommandDTO webCommand) {
        System.out.println("登陆handle");
        System.out.println("命令："+webCommand.getCommand());
        System.out.println("参数："+webCommand.getParam());
    }
}
