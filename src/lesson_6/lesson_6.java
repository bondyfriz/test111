package lesson_6;
//
public class lesson_6 {
}
//
class MethodOverloading {
//
    void show(int i1) {
        System.out.println(i1);
    }
//
    void show(boolean b1) {
        System.out.println(b1);
    }
//
    void show(String s1) {
        System.out.println(s1);
    }
//
    void show(int a, int b) {
        System.out.println(a);
    }
//
    void show(String s, int a) {
        System.out.println("String: " + s + "int: " + a);
    }
    void show( int a, String s) {
        System.out.println("qq");
    }
//
}
//
class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading  mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "ya natyral";
        mO.show(s);
        mO.show("ky ", 10);
        mO.show(10, " ky");


    }
  //
}