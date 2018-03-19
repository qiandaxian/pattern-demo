package pattern.state;

public interface CommandState {
    void handle(WebCommand webCommand);
}
