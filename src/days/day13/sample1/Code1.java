package days.day13.sample1;

public class Code1 {
    public static void main(String[] args) {
        MyIntegerClass myIntegerClass = new MyIntegerClass(5);
        myIntegerClass.print();

        MyDoubleClass myDoubleClass = new MyDoubleClass(3.14);
        myDoubleClass.print();
    }
}

class MyIntegerClass{
    Integer i;

    public MyIntegerClass(Integer i) {
        this.i = i;
    }

    public void print(){
        System.out.println(i);
    }
}

class MyDoubleClass{
    Double d;

    public MyDoubleClass(Double d) {
        this.d = d;
    }

    public void print(){
        System.out.println(d);
    }
}