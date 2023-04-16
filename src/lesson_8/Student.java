package lesson_8;

public class Student {
    String name;
    int course;
    static int count;
    int a;
    static int b;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student № " + count + " ready");
    }
    public Student () {
        this(null,0);

    }
    public static void show_count() {
        System.out.println("Аккаунтов созданно: " + count);

    }
    public static void showInfo() {
        System.out.println("Welcome to the club, buddy ");
    }

    void abc () {
    a++;
    count++;

    }
    static void abcd () {
        count++;
        Student st2 = new Student("name", 3);
        st2.a++;

    }

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("name", 4);

        st3.abc();



    }



}



class StudentTest {



    }


