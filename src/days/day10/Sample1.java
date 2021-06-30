package days.day10;

public class Sample1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyThread1 myThread12 = new MyThread1();
        myThread12.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}