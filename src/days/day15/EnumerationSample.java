package days.day15;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationSample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i < 10; i++){
            vector.add(i);
        }

        Enumeration<Integer> e = vector.elements();
        while(e.hasMoreElements()){
            Integer i = e.nextElement();
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
