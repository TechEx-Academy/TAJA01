package days;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Temp {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(5));
        System.out.println(set.add(6));
        System.out.println(set.add(7));


        for(Integer integer : set){
            System.out.println(integer);
        }


    }

    public static void foo(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 100000000; i++){
            int a = ThreadLocalRandom.current().nextInt(1, 100);
            arr.add(a);
        }
        arr.add(500);
        long start = System.currentTimeMillis();
        arr.contains(500);
        long end = System.currentTimeMillis();

        System.out.println("ArrayList: " + (end - start));

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 100000000; i++){
            int a = ThreadLocalRandom.current().nextInt(1, 100);
            set.add(a);
        }
        arr.add(500);
        start = System.currentTimeMillis();
        set.contains(500);
        end = System.currentTimeMillis();

        System.out.println("Set:" + (end - start));
    }
}

