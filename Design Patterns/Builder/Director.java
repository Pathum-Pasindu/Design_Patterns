package Builder;

public class Director {
    public void buildDesktop(ComputerBuilder builder) {
        builder.setCPU("Intel Core i7");
        builder.setRAM("16GB DDR4");
        builder.setGPU("NVIDIA GeForce RTX 3060");
        builder.setStorage("512GB SSD");
    }

    public void buildLaptop(ComputerBuilder builder) {
        builder.setCPU("AMD Ryzen 9");
        builder.setRAM("32GB DDR4");
        builder.setGPU("NVIDIA GeForce RTX 3080");
        builder.setStorage("1TB NVMe SSD");
    }
}
