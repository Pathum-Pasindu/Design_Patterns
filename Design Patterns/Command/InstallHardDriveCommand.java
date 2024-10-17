package Command;

public class InstallHardDriveCommand implements Command {
    private Receiver receiver;

    public InstallHardDriveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.installHardDrive();
    }
}
