package Builder;

public class DesktopComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String ram;
    private String gpu;
    private String storage;


    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Computer build() {
        return new Computer(cpu, ram, gpu, storage);
    }
}
