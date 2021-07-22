package days.day14;

import java.util.*;

/*
    https://www.bigocheatsheet.com/
    Use this cheatsheet to find time/space complexities of each collection data structure
 */

public class ListSample {
    public static void main(String[] args) {

    }

    // ArrayList
    public void arrayListSample(){
        // [1,2,3]
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Get item by index
        int a = list.get(0);
        System.out.println(a);

        // Get index of item
        int index = list.indexOf(2);
        System.out.println(index);

        // Check contains
        boolean isExist = list.contains(3);
        System.out.println(isExist);
    }

    // LinkedList
    public void linkedListSample(){
        // [1] -> [2] -> [3] -> [4]
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    // Stack
    public void stackSample(){
        // Top [1][2][3][4]
        List<Integer> list = new Stack<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
