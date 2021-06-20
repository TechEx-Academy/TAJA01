package days.day8;

import java.util.jar.Manifest;

public class MethodOverloadingSample {
    public static void main(String[] args) {

        Animal a;

        if(args[0].equals("animal")){
            a = new Animal();
        }else{
            a = new Fish();
        }

        a.move();

    }
}

class Animal{
    void move(){
        System.out.println("Move");
    }
}

class Fish extends Animal{
    void move(){
        System.out.println("Swim");
    }
}