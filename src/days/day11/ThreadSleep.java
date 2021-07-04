package days.day11;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();

        System.out.println("before interrupt");
        a.interrupt();
        System.out.println(a.getState());
        System.out.println("after interrupt");
    }
}

class ThreadA extends Thread{
    public void run(){
        long t = System.currentTimeMillis();
        while(System.currentTimeMillis() < t + 5000){

        }

        System.out.println("After 5 seconds");
    }
}