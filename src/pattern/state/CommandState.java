package pattern.state;

/**
 * 状态处理接口定义
 */
public interface CommandState {
    void handle(WebCommand webCommand);
}
