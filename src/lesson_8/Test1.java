package lesson_8;

public class Test1 {

    public final int a;

    Test1 () {
        a = 10;
    }

    Test1 (boolean b) {
        a = 15;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a *= 2;
        System.out.println("Переменная а: " + t.a);
    }
}
