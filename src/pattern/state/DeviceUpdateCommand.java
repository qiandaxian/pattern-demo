package pattern.state;

public class DeviceUpdateCommand implements CommandState {


    @Override
    public void handle(WebCommandDTO webCommand) {
        System.out.println("更新handle");
        System.out.println("命令："+webCommand.getCommand());
        System.out.println("参数："+webCommand.getParam());

    }
}
