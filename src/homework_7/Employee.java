package homework_7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void print_id() {
        System.out.println("ID: " + id);
    }
    public void print_surname() {
        System.out.println("Surname: " + surname);
    }
    public void print_salary() {
        System.out.println("Salary: " + salary);
    }
    Employee (int id_1) {
        id = id_1;
    }
    public Employee (String surname_1) {
        surname = surname_1;
    }
    private Employee (double salary_2) {
        salary = salary_2;
    }

//    public static void main(String[] args) {
//        z1.print_id();
//        z1.print_salary();
//        z1.print_surname();


//    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee z2 = new Employee(1);
        z2.print_id();
        z2.print_salary();
        z2.print_surname();
    }

}
