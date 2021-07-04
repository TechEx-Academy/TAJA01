package days.day11;

public class Sample4 {
    public static void main(String[] args) {

        MyThreadA a = new MyThreadA();
        a.setPriority(6);
        a.start();

    }
}

class MyThreadA extends Thread{
    public void run(){
        MyThreadB b = new MyThreadB();
        System.out.println(b.getPriority());
    }
}

class MyThreadB extends Thread{
    public void run(){

    }
}
