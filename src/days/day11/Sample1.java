package days.day11;

public class Sample1 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    public void run(){}
}