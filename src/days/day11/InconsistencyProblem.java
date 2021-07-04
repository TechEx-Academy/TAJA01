package days.day11;

public class InconsistencyProblem {
    public static void main(String[] args) {
        Printer printer = new Printer();
        MyThread1 t1 = new MyThread1(printer, "Java");
        MyThread1 t2 = new MyThread1(printer, "Python");
        t1.start();
        t2.start();

    }
}

class Printer{
    public synchronized void print(String name){
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThread1 extends Thread{

    Printer printer;
    String name;

    public MyThread1(Printer printer, String name) {
        this.printer = printer;
        this.name = name;
    }

    public void run(){
        printer.print(name);
    }
}