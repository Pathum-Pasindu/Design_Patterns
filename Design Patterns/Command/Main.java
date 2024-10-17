package Command;

public class Main {
    public static void main(String[] args) {
       
        Receiver receiver = new Receiver();

        
        Command installCPU = new InstallCPUCommand(receiver);
        Command installRAM = new InstallRAMCommand(receiver);
        Command installHardDrive = new InstallHardDriveCommand(receiver);
        Command installOS = new InstallOperatingSystemCommand(receiver);

        
        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.addCommand(installCPU);
        computerAssembler.addCommand(installRAM);
        computerAssembler.addCommand(installHardDrive);
        computerAssembler.addCommand(installOS);

       
        computerAssembler.assembleComputer();
    }
}

