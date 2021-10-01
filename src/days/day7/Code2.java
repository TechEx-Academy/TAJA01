package days.day7;

public class Code2 {
    public static void main(String[] args) {

        Ram ram = new Ram("Kingston");
        Processor2 processor2 = new Processor2("Intel");
        Keyboard keyboard = new Keyboard("Logitech");
        Laptop2 laptop2 = new Laptop2("HP", ram, processor2, keyboard);

        Bag b = new Bag("Black");

        SimCard simCard = new SimCard("ABC");
        Phone phone = new Phone("Black", simCard);

        Student2 student = new Student2("Amal", 25, b, laptop2, phone);

        //System.out.println(student.laptop.ram.brandName);

        Student2 student2 = new Student2(
                "Kamal",
                24,
                new Bag("Blue"),
                new Laptop2(
                        "HP",
                        new Ram("Intel"),
                        new Processor2("Intel"),
                        new Keyboard("Samsung")
                ),
                new Phone(
                        "Gray",
                        new SimCard("Telco")
                        )
                );

        System.out.println(student2.phone.simCard.serviceProvider);
        
        System.out.println(student.phone.simCard.serviceProvider);
    }
}

class Student2{
    String name;
    int age;
    Bag bag;
    Laptop2 laptop;
    Phone phone;

    public Student2(String name, int age, Bag bag, Laptop2 laptop, Phone phone) {
        this.name = name;
        this.age = age;
        this.bag = bag;
        this.laptop = laptop;
        this.phone = phone;
    }
}

class Bag{
    String color;

    public Bag(String color) {
        this.color = color;
    }
}

class Phone{
    String color;
    SimCard simCard;

    public Phone(String color, SimCard simCard) {
        this.color = color;
        this.simCard = simCard;
    }
}

class SimCard{
    String serviceProvider;

    public SimCard(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}

class Laptop2{
    String brandName;
    Ram ram;
    Processor2 processor2;
    Keyboard keyboard;

    public Laptop2(String brandName, Ram ram, Processor2 processor2, Keyboard keyboard) {
        this.brandName = brandName;
        this.ram = ram;
        this.processor2 = processor2;
        this.keyboard = keyboard;
    }
}

class Ram{
    String brandName;

    public Ram(String brandName) {
        this.brandName = brandName;
    }
}

class Processor2{
    String brandName;

    public Processor2(String brandName) {
        this.brandName = brandName;
    }
}

class Keyboard{
    String brandName;

    public Keyboard(String brandName) {
        this.brandName = brandName;
    }
}