package Command;

public class InstallRAMCommand implements Command {
    private Receiver receiver;

    public InstallRAMCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.installRAM();
    }
}
