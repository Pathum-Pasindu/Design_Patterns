package Command;

public class InstallCPUCommand implements Command {
    private Receiver receiver;

    public InstallCPUCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.installCPU();
    }
}
