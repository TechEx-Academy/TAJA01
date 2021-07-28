package days.day15;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("JavaScript");

        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String element = listIterator.next();
            if(element.equals("Python")){
                listIterator.set("R");
            }else if(element.equals("C")){
                listIterator.remove();
            }
        }
    }
}
