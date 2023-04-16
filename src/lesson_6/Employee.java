package lesson_6;
//─
public class Employee {
//─
        int id;
        String surname;
        int age;
        double salary;
        String department;
//─
        Employee (int id2, String surname2, int age2) {
                //this(surname2, age2);
                //id = id2;
                this(id2, surname2, age2,0.0, null);


        }
//─
        Employee (String surname3, int age3) {
                //surname = surname3;
                //age = age3;
                this(0, surname3, age3,0.0,null);
        }
//─
       Employee (int id4, String surname4, int age4, double salary4, String department4) {
               //this(id4, surname4, age4);
               //salary = salary4;
               //department = department4;
               id = id4;
               surname = surname4;
               age = age4;
               salary = salary4;
               department = department4;
       }
//─
}
//─
class EmployeeTest {
        public static void main(String[] args) {
                Employee emp = new Employee(1, "Bondy", 25);
                System.out.println(emp.surname);
                Employee emp2 = new Employee("Friz", 26);
                System.out.println(emp2.surname);
                Employee emp3 = new Employee(1, "Name", 23, 25000, "Эвт");
                System.out.println(emp3.salary);


        }
}
//─