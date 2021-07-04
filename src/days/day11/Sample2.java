package days.day11;

public class Sample2 {
    public static void main(String[] args) {
        MyPrinter p = new MyPrinter();
        MyThread3 t1 = new MyThread3(p);
        MyThread3 t2 = new MyThread3(p);
        t1.start();
        t2.start();
    }
}

class MyPrinter{
    void foo(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("foo");
        }
    }
}

class MyThread3 extends Thread{
    MyPrinter myPrinter;

    public MyThread3(MyPrinter myPrinter) {
        this.myPrinter = myPrinter;
    }

    public void run(){
        myPrinter.foo();
    }
}