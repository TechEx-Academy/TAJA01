package days.day13.sample3;

public class Code3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        MyGenericAnimalFeeder<Dog> myGenericAnimalFeeder = new MyGenericAnimalFeeder<>(d);
        myGenericAnimalFeeder.feed();
    }
}

abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dog eating");
    }
}

class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("Cat eating");
    }
}

class MyGenericAnimalFeeder<T extends Animal>{
    T t;

    public MyGenericAnimalFeeder(T t) {
        this.t = t;
    }

    public void feed(){
        t.eat();
    }
}