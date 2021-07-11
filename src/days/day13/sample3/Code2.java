package days.day13.sample3;

public class Code2 {
    public static void main(String[] args) {
        MyNewCalculator<Integer> myNewCalculator = new MyNewCalculator<>(5,6);
        myNewCalculator.multiplication();
    }
}

class MyNewCalculator<T extends Number>{
    T t1;
    T t2;

    public MyNewCalculator(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void multiplication(){
        System.out.println(t1.intValue() * t1.intValue());
    }
}