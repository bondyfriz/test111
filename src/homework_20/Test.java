package homework_20;

import java.util.*;

public class Test {

    static ArrayList<String> abc(String... s) {
    ArrayList <String> arr = new ArrayList<>();
    for (String s1 : s) {
        if (!arr.contains(s1)){
            arr.add(s1);
        }
    }
    Collections.sort(arr);
    System.out.println(arr);


    return arr;

    }


    public static void main(String[] args) {
        Test t = new Test();
        String str1[] = new String[]{"1", "3", "2", "1", "2", "5"};
        t.abc(str1);

        for (String s : str1) {
            System.out.println(s);
        }



    /*
    ArrayList <String> arr = new ArrayList<>();

    for (int i = 0; i < str1.length; i++) {
            arr.add(str1[i]);
    }

    Collections.sort(arr);
    System.out.println(arr);
*/


    }
}




