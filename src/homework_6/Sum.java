package homework_6;

public class Sum {
//─── сумма 4 чисел
    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Сумма 4 чисел: ");
        return result;
    }

//─── сумма 3 чисел
    int sum(int a, int b, int c) {
        return sum(a, b, c, 0);
    }
//─── сумма 2 чисел
    int sum(int a, int b) {
        return sum(a, b, 0, 0);
    }
//─── сумма 1 числа
    int sum(int a) {
        return sum(a, 0, 0, 0);
    }
//───
    int sum() {
        return sum(0);
    }

//───
    public static void main(String[] args) {
        Sum x = new Sum();
        System.out.println(x.sum());
    }
}
