package days.day11;

public class Sample3 {
    public static void main(String[] args) throws InterruptedException {

        MyThread4 t1 = new MyThread4();
        t1.start();

        Thread.sleep(1000);

        System.out.println(t1.isAlive());
        System.out.println(t1.getState());

    }
}

class MyThread4 extends Thread{
    public void run(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
