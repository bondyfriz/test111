package homework_8_1;

public class math2 {
    static final double pi = 3.14;

    double Square(double radius) {
        //System.out.println("Площадь круга: " + S);
        double S = radius * radius * pi;
        return S;

    }
    double Length (double radius) {
        double l = 2 * pi * radius;
        return l;
        //System.out.println("Длина окружности: " + l);
    }
    void Info (double radius) {
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь круга: " + Square(radius));
        System.out.println("Длина окружности: " + Length(radius));



    }
}

class math_test {
    public static void main(String[] args) {
        math2 r1 = new math2();
        r1.Info(10);
    }

}