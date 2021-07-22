package days.day13.sample2;

import java.util.ArrayList;

public class Code1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Amal");
        arr.add("Nimal");
        arr.add(10);

        for(Object obj : arr){
            char letter = ((String) obj).charAt(0);
            System.out.println(letter);
        }
    }

    public void foo(){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Amal");
        arr.add("Kamal");
        // arr.add(10);

        /*
            Get the error at the compile time
            Fast fail rule
            Application will not fail at the runtime
         */
    }
}
