package Builder;

public class Computer {
    private String cpu;
    private String ram;
    private String gpu;
    private String storage;

    public Computer(String cpu, String ram, String gpu, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.storage = storage;
    }

    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", GPU=" + gpu + ", Storage=" + storage + "]";
    }
}
