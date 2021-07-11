package days.day13.sample4;

public class Code1 {
    public static void main(String[] args) {
        GenericMethodClass methodClass = new GenericMethodClass();
        methodClass.foo(3.14);

        GenericMethodClass.bar("Hello world");
    }
}

class GenericMethodClass{
    public <T> void foo(T t){
        System.out.println(t.getClass());
    }

    public static <U> void bar(U u){
        System.out.println(u.getClass());
    }
}