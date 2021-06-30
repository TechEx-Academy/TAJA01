package days.day10;

public class Sample4 {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        MyThread4 t1 = new MyThread4(0,3, arr);
        MyThread4 t2 = new MyThread4(4,7, arr);
        MyThread4 t3 = new MyThread4(8,11, arr);
        MyThread4 t4 = new MyThread4(12,15, arr);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int total = t1.sum + t2.sum + t3.sum + t4.sum;
        System.out.println(total);
    }
}

class MyThread4 extends Thread{
    int start;
    int end;
    int[] arr;
    int sum;

    public MyThread4(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public void run(){
        for(int i = start; i < end+1; i++){
            sum += arr[i];
        }
    }
}