package days.day10;

public class Sample3 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start();
    }
}

class MyThread3 extends Thread{
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}