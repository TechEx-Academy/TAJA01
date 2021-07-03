package days.day10;

public class Sample6 {
    public static void main(String[] args) {
        Com com = new Com();
        MyThread6 t1 = new MyThread6("Java", com);
        MyThread6 t2 = new MyThread6("Python", com);
        t1.start();
        t2.start();
    }
}

class MyThread6 extends Thread{
    String name;
    Com com;

    public MyThread6(String name, Com com) {
        this.name = name;
        this.com = com;
    }

    public void run(){
       com.foo(name);
    }
}

class Com{
    synchronized void foo(String name){
        for(int i = 0; i < 10; i++){
            System.out.println(name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}