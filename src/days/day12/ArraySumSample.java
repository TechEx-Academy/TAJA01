package days.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraySumSample {

    public static void main(String[] args) throws InterruptedException {
        int n = 100000000;
        int arr[] = new int[n];

        Random r = new Random();
        for(int i = 0; i < n; i++){
            arr[i] = r.nextInt(100);
        }

        List<SumThread> trr = new ArrayList<>();

        trr.add(new SumThread(0,(int)n/4, arr));
        trr.add(new SumThread(((int)n/4) + 1,(int)n/2, arr));
        trr.add(new SumThread(((int)n/2) + 1,(int)3*n/4, arr));
        trr.add(new SumThread((int)3*n/4,n-1, arr));

        long start = System.currentTimeMillis();

        for(SumThread s : trr){
            s.start();
        }

        for(SumThread s : trr){
            s.join();
        }

        long total = 0;
        for(SumThread s : trr){
            total += s.sum;
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

}

class SumThread extends Thread{
    int start;
    int end;
    long sum;
    int arr[];

    public SumThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public void run(){
        for(int i = start; i <= end; i++){
            this.sum += Math.pow(arr[i], 2);
        }
    }
}