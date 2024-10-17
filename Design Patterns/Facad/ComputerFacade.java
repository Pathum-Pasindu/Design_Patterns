package Facad;

public class ComputerFacade {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;
    private OperatingSystem os;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new RAM();
        this.hardDrive = new HardDrive();
        this.os = new OperatingSystem();

    }

    public void assembleComputer() {
        System.out.println("Starting to assemble computer...");

        try {
            cpu.attachCPU();
        } catch (Exception e) {
            System.err.println("Error attaching CPU: " + e.getMessage());
            return;
        }

        try {
            ram.attachRAM();
        } catch (Exception e) {
            System.err.println("Error attaching RAM: " + e.getMessage());
            return;
        }

        try {
            hardDrive.attachHardDrive();
        } catch (Exception e) {
            System.err.println("Error attaching Hard Drive: " + e.getMessage());
            return; 
        }

        try {
            os.loadOS();
        } catch (Exception e) {
            System.err.println("Error loading Operating System: " + e.getMessage());
            return; 
        }

        System.out.println("Computer assembled successfully.");
    }
}
