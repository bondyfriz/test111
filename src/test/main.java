package test;

public class main {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(main.b);

    }
}
/**    public static int count;
    public final int a;

    main () {
        a = 10;
        System.out.println(a);
    }
    main (boolean b) {
        a = 15;
        System.out.println(a);
    }
    public static void count_plus () {
        count++;
        System.out.println("Count: " + count);

    }
}


**/

class main_test {
    public static void main(String[] args) {
        main.abc(5);
        main.abc(6);

        //main.count_plus();
        //main.count_plus();
        //main t = new main();
        //main t1 = new main(true);

    }
}