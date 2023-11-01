public class Main {
    public static void main(String[] args) {
        System.out.println("1. Creating Computer class");
        RAM ram = new RAM("Gigabyte",8);
        HDD hdd = new HDD("Samsung",250,true);
        Computer computer1 = new Computer("Acer Dominator", 2000, ram, hdd);
        Computer computer2 = new Computer("Noname Integral", 500);
        computer1.info();
        computer2.info();
    }
}

class Computer{
    String model;
    int price;
    RAM ram;
    HDD hdd;

    public Computer(String model, int price){
        this.model = model;
        this.price = price;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String model, int price, RAM ram, HDD hdd){
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void info(){
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.print("RAM Parameters: ");
        this.ram.info();
        System.out.print("HDD Parameters: ");
        this.hdd.info();
    }

}

class RAM{
    String name;
    int size;

    public RAM(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public RAM() {
        this.name = "N/A";
        this.size = 0;
    }

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Size (GB): " + size);
    }

}

class HDD{
    String name;
    int size;
    boolean type; // Переключалка внешний (1) или внутренний (0)

    public void info(){
        System.out.println("Name: " + name);
        System.out.println("Size (GB): " + size);
        if (type){
            System.out.println("External");
        } else {
            System.out.println("Internal");
        }
    }

    public HDD(String name, int size, boolean type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public HDD() {
        this.name = "N/A";
        this.size = 0;
        this.type = false;
    }

}