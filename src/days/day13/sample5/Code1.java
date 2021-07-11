package days.day13.sample5;

import java.util.ArrayList;

public class Code1 {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.add("a", 5);
        myHashMap.add("b", 10);

        Integer a = myHashMap.get("c");
        System.out.println(a);
    }
}

/*
    Very bad inefficient way to implement a HashMap
    Use this to get your project fail :)
 */
class MyHashMap<T, U>{
    ArrayList<T> keys;
    ArrayList<U> values;

    public MyHashMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void add(T key, U value){
        this.keys.add(key);
        this.values.add(value);
    }

    public U get(T t){
        int index = keys.indexOf(t);
        if(index >= 0){
            return values.get(index);
        }
        return null;
    }
}