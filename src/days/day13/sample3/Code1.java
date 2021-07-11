package days.day13.sample3;

public class Code1 {
    public static void main(String[] args) {

    }
}

class MyCalculator<T>{
    T t1;
    T t2;

    public MyCalculator(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public void multiplication(T t1, T t2){
        //System.out.println(t1 * t2);
    }
}