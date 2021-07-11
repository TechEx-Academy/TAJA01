package days.day13.sample1;

public class Code2 {
    public static void main(String[] args) {
        MyGenericClass<Integer> integerGeneric = new MyGenericClass<>(5);
        integerGeneric.print();

        MyGenericClass<Double> doubleGeneric = new MyGenericClass<>(3.14);
        doubleGeneric.print();
    }
}

class MyGenericClass<T>{
    T t;

    public MyGenericClass(T t) {
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }
}