package days.day12;

import java.util.Random;

public class ArraySumSingleThread {
    public static void main(String[] args) {

        int n = 100000000;
        int arr[] = new int[n];

        Random r = new Random();
        for(int i = 0; i < n; i++){
            arr[i] = r.nextInt(100);
        }

        long total = 0;
        long start = System.currentTimeMillis();
        for(int i : arr){
            total += Math.pow(i, 2);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
