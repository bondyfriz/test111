package test2;

public class car {
    String color = "blue";
    String engine = "V6";

}

class human {
        String name = "bondy";
        final car c1 = new car();

    public static void main(String[] args) {
        human h1 = new human();


        h1.c1.engine = "V8";
    }

}