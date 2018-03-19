package pattern.state;

/**
 * camel processor
 */
public class WebCommandProcessor {
    private CommandState commandState;

    public CommandState getCommandState() {
        return commandState;
    }

    public void setCommandState(CommandState commandState) {
        this.commandState = commandState;
    }

    public void doProcess(WebCommand webCommand){
        this.setCommandState(getCommandStateByWebCommand(webCommand));
        commandState.handle(webCommand);
    }

    private CommandState getCommandStateByWebCommand(WebCommand webCommand)  {
        CommandState commandState = null;
        try {
            //如果状态实例由spring容器管理，可以用ApplicationContext.getBean(class)，获取状态实例。
            Class a =Class.forName("pattern.state."+webCommand.getCommand());
            commandState =  (CommandState)a.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return commandState;
    }

    public static void main(String[] args) {
        WebCommand webCommand = new WebCommand();
        webCommand.setCommand("DeviceUpdateCommand");
        webCommand.setParam("设备更新参数");

        WebCommandProcessor webCommandProcessor = new WebCommandProcessor();
        webCommandProcessor.doProcess(webCommand);
    }

}
