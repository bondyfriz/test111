package lesson_4;



public class lesson_4 {

}

class Student {
    int id;
    String name;
    String surname;
    int year_study;
    float math_average;
    float economics_average;
    float language_average;
//───
    Student (int id2, String name2, String surname2, int year_study2, float math_average2, float economics_average2, float language_average2) {
        id = id2;
        name = name2;
        surname = surname2;
        year_study = year_study2;
        math_average = math_average2;
        economics_average = economics_average2;
        language_average = language_average2;

    }
//───
    Student (int id3, String name3, String surname3, int year_study3 ) {
        this(id3, name3, surname3, year_study3, 0, 0 ,0);

    }
//───
    Student() {

    }


    float avg (float a, float b, float c) {
    float result = (a + b + c)/3;
    return result;

    }
}

class StudentTest {


    public static void main(String[] args) {


        Student student_1 = new Student(1, "David", "Lebovsky", 2001, 4.7F, 4.9F, 4.0F);
        Student student_2 = new Student(2, "Ukrop", "Lebovsky", 2001);
        Student student_3 = new Student();

        System.out.println(student_3.name);

/*      student_1.number_ticket = 1;
        student_1.name = "Виктор";
        student_1.surname = "Зевак";
        student_1.year_study = 2018;
        student_1.math_average = 4.9F;
        student_1.economics_average = 4.8F;
        student_1.language_average = 4.7F;

        student_2.number_ticket = 2;
        student_2.name = "Николай";
        student_2.surname = "Басков";
        student_2.year_study = 2019;
        student_2.math_average = 4.5F;
        student_2.economics_average = 4.3F;
        student_2.language_average = 4.1F;

        student_3.number_ticket = 3;
        student_3.name = "Сергей";
        student_3.surname = "Зверев";
        student_3.year_study = 2019;
        student_3.math_average = 4.0F;
        student_3.economics_average = 4.7F;
        student_3.language_average = 4.9F;

            System.out.println("Средняя оценка студентов по предметам: " + student_1.avg(student_1.math_average,student_1.economics_average,student_1.language_average));
            System.out.println("Средняя оценка студентов по предметам: " + student_2.avg(student_2.math_average,student_2.economics_average,student_2.language_average));
            System.out.println("Средняя оценка студентов по предметам: " + student_3.avg(student_3.math_average,student_3.economics_average,student_3.language_average));

 */

    }



}