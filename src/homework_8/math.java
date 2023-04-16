package homework_8;

public class math {

    static int multiplication(int i1, int i2, int i3) {
        return i1 * i2 * i3;
    }

    static void division (double j1, double j2) {
        double result = j1 / j2;
        System.out.println("Division result: " + result);
    }
}

class math_test {
    public static void main(String[] args) {
        math multi1 = new math(); //создаю объект при методе без static
        math multi2 = new math(); //создаю объект при методе без static
        System.out.println("Multi result: " + multi1.multiplication(1,2,3));
        System.out.println("Multi result: " + multi2.multiplication(1,2,4));

        //System.out.println("Multi result: " + math.multiplication(1, 2, 3)); // использую метод без объекта со static
        //System.out.println("Multi result: " + math.multiplication(1, 2, 4)); // использую метод без объекта со static

        math div1 = new math();
        math div2 = new math();
        div1.division(1,2); //создаю объект при методе без static
        div2.division(10,2); //создаю объект при методе без static

        //math.division(1,  2); // использую метод без объекта со static
        //math.division(10, 2); // использую метод без объекта со static



    }
}