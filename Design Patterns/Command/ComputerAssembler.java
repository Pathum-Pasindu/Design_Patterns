package Command;
import java.util.*;

public class ComputerAssembler {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void assembleComputer() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
