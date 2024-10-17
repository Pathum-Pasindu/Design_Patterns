package Command;

public class InstallOperatingSystemCommand implements Command {
    private Receiver receiver;

    public InstallOperatingSystemCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.installOperatingSystem();
    }
}
