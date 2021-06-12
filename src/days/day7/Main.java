package days.day7;

public class Main {
    public static void main(String[] args) {
        Processor p = new Processor("Intel");
        Laptop laptop = new Laptop("Dell", p);
        Student s = new Student("Amal", laptop);


    }
}

class Student{
    String name;
    Laptop laptop;

    Student(String name, Laptop laptop){
        this.name = name;
        this.laptop = laptop;
    }
}

class Laptop{
    String brandName;
    Processor processor;

    Laptop(String brandName, Processor processor){
        this.brandName = brandName;
        this.processor = processor;
    }
}

class Processor{
    String brandName;

    Processor(String brandName){
        this.brandName = brandName;
    }
}