package days.day16;

public class Temp {
    public static void main(String[] args) {

        Power p = n -> n*n;

        int power = p.pow(5);
        System.out.println(power);
    }
}

interface Sample{
    void action();
}

interface Adder{
    void add(int a, int b);
}

interface Printer{
    void print(String s);
}

interface Foo{
    int bar(int a);
}

interface Power{
    int pow(int n);
}