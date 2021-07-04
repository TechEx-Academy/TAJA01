package days.day12;

public class JoinExample {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        ThreadB t1 = new ThreadB(threadA);
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();

    }
}

class ThreadA extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println("I am thread A");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadB extends Thread{

    ThreadA threadA;

    public ThreadB(ThreadA threadA) {
        this.threadA = threadA;
    }

    public void run(){
        System.out.println("Start of the thread B");
        threadA.start();

        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of the thread B");
    }
}