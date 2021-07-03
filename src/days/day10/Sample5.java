package days.day10;

public class Sample5 {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5("Java");
        MyThread5 t2 = new MyThread5("Python");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}

class MyThread5 extends Thread{

    String name;

    public MyThread5(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(this.name);
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}