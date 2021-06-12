package days.day6;

public class Main {
    public static void main(String[] args) {

        GermanShepard gs = new GermanShepard("Tommy", "Brown", false);

    }
}

class Animal{
    String name;
    String color;

    Animal(){
        System.out.println("Animal created");
    }

    Animal(String name, String color){
        this();
        this.color = color;
        this.name = name;
    }
}

class Dog extends Animal{
    boolean isFriendly;

    Dog(String name, String color, boolean isFriendly){
        super(name, color);
        System.out.println("Dog created");
        this.isFriendly = isFriendly;
    }


}


class GermanShepard extends Dog{

    public GermanShepard(String name, String color, boolean isFriendly){
        super(name, color, isFriendly);
        System.out.println("GermanShepard created");

        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.isFriendly);
    }

}

class Alsatian extends Dog{

    public Alsatian(String name, String color, boolean isFriendly){
        super(name, color, isFriendly);
        System.out.println("GermanShepard created");
    }

}