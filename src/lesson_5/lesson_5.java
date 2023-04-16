package lesson_5;

public class lesson_5 {
    public static void main(String[] args) {
        BankAccount acc_1 = new BankAccount();
        BankAccount acc_2 = new BankAccount();
        BankAccount acc_3 = new BankAccount();

        acc_1.id = 1;
        acc_1.name = "Лео";
        acc_1.balance = 57.60;

        acc_1.popolnenieSheta(10); //пополнение счёта acc_1
        acc_1.snyatieSheta(10); //снятие со счёта acc_1



        System.out.println(acc_1.balance);


    }




    }
class BankAccount {
    double popolnenieSheta(double a) {
    balance += a;
    return balance;

    }
    double snyatieSheta(double a) {
        balance -= a;
        return balance;

    }
    int id;
    String name;
    double balance;


}





