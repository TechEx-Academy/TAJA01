package days.day8;

public class MethodOverLoadingSample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(3);
        c.add(1, 2);
    }
}

class Calculator{
    int add(int a){
        return a ;
    }

    float add(int b, int v){
        return b;
    }
}