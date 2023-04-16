package lesson_3;

public class lesson_3 {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        int c = a % b; // % - это остаток от деления 11 на 3(то есть 2 остаток)

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        a = 5;
        b = 8;

        System.out.println( ++b - b++ + ++b - --b);

    }
}

// a = 5;
// 6 - 5 - 5 + 4
// a = 5
// (11 / 5.5) + (1.3 % 5) - 20 = 2 + 1.3 - 20 = -16.7


// 5 - 3 + 4 + 4 + 5 = 15
// 4 3 4 5

// 9 - 9 + 11 - 10 = 1
// 8 9