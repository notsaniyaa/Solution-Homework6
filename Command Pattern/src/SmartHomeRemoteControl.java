import commands.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slotName, Command command) {
        slots.put(slotName, command);
    }

    public void pressButton(String slotName) {
        Command command = slots.get(slotName);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("[Remote] No command assigned to: " + slotName);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        } else {
            System.out.println("[Remote] Nothing to undo");
        }
    }
}
