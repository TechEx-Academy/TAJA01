package days.day14;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("name", 101);
        map.put("email", 102);
        map.put("mobile", 103);

        Integer mobile = map.get("mobile");
        System.out.println(mobile);
    }
}
