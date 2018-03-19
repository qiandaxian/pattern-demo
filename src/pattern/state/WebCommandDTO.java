package pattern.state;

/**
 * 命令对象
 */
public class WebCommandDTO {
    private String command;
    private String param;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
