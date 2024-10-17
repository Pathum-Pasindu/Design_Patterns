package Builder;

public interface ComputerBuilder {
    void setCPU(String cpu);
    void setRAM(String ram);
    void setGPU(String gpu);
    void setStorage(String storage);
    Computer build();
}
