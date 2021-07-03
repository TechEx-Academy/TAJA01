package days.day9;


public class ExceptionHandlingSample {
    public static void main(String[] args) {
        try{
            foo();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("hello");
    }

    static void foo(){
        foo();
    }
}
