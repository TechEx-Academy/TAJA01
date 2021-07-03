package days.day10;

public class Sample2 {
    public static void main(String[] args) {
        MyThread2 runnableThread = new MyThread2();
        Thread t1 = new Thread(runnableThread);
        t1.start();

        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }
}

class MyThread2 implements Runnable{
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
