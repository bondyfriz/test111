package lesson_5;
//
public class lesson_5_1 {


}
//
class Employee {
    Employee(int a, String b, int c, float d, String e) {
        id = a;
        surname = b;
        age = c;
        salary = d;
        department = e;
        
    }
//
    float double_salary(){

        salary *= 2;
        return salary;
    }
//
    int id;
    String surname;
    int age;
    float salary;
    String department;

}
//
class EmployeeTest {
    public static void main(String[] args) {
    Employee worker_1 = new Employee(1, "Анатолий Бондарев", 25, 22000, "ЭВТ");
    Employee worker_2 = new Employee(2, "Виктор Зевак", 24, 30000, "ЭВТ");
    worker_1.double_salary();
    worker_2.double_salary();

    System.out.println(worker_1.salary);
    System.out.println(worker_2.salary);



}
}