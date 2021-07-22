package days.day14;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SetSample {
    public static void main(String[] args) {
        ArraySearchTime();
        SetSearchTime();
    }

    public static void foo(){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(7);
        set.add(3);

        boolean isExist = set.contains(3);
        System.out.println(isExist);
    }

    public static void ArraySearchTime(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10000000; i++){
            list.add(ThreadLocalRandom.current().nextInt(0, 100 + 1));
        }
        list.add(1000);
        long start = System.currentTimeMillis();
        list.contains(1000);
        long end = System.currentTimeMillis();
        System.out.println("Array: " + (end - start));
    }

    public static void SetSearchTime(){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 10000000; i++){
            set.add(ThreadLocalRandom.current().nextInt(0, 100 + 1));
        }
        set.add(1000);
        long start = System.currentTimeMillis();
        set.contains(1000);
        long end = System.currentTimeMillis();
        System.out.println("Set: " + (end - start));
    }
}
