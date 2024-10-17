package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        
        ComputerBuilder desktopBuilder = new DesktopComputerBuilder();
        director.buildDesktop(desktopBuilder);
        Computer desktop = desktopBuilder.build();
        System.out.println("Desktop Computer: " + desktop);

        
        ComputerBuilder laptopBuilder = new LaptopComputerBuilder();
        director.buildLaptop(laptopBuilder);
        Computer laptop = laptopBuilder.build();
        System.out.println("Laptop Computer: " + laptop);
    }
    
}
