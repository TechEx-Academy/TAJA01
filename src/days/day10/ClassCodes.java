package days.day10;

public class ClassCodes {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        ArraySumThread t1 = new ArraySumThread(arr, 0, 3);
        ArraySumThread t2 = new ArraySumThread(arr, 4, 7);
        ArraySumThread t3 = new ArraySumThread(arr, 8, 11);
        ArraySumThread t4 = new ArraySumThread(arr, 12, 15);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int total = t1.sum + t2.sum + t3.sum + t4.sum;
        System.out.println(total);

    }
}

class ArraySumThread extends Thread{
    int[] arr;
    int start;
    int end;
    int sum;

    public ArraySumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i = start; i <= end; i++){
            sum += arr[i];
        }
    }
}