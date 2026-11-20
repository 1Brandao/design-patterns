import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RemoteControl {
    private final Map<String, Command> buttons = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String button, Command command) {
        if (button == null || button.isEmpty()) {
            throw new IllegalArgumentException("Button name is required");
        }
        buttons.put(button, Objects.requireNonNull(command, "Command is required"));
    }

    public void pressButton(String button) {
        Command command = buttons.get(button);
        if (command == null) {
            System.out.println("Button not configured: " + button);
            return;
        }
        command.execute();
        lastCommand = command;
    }

    public void undoLast() {
        if (lastCommand == null) {
            System.out.println("No action to undo");
            return;
        }
        lastCommand.undo();
        lastCommand = null;
    }
}
