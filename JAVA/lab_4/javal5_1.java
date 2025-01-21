package LAB;
import java.util.Scanner;

class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + balance);
    }

    void credit(double amount) {
        balance += amount;
        System.out.println("A/C credited with Rs. " + amount + " and Balance: Rs. " + balance);
    }

    void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("A/C debited with Rs. " + amount + " and Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class javal5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accNum = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder name:");
        String name = sc.nextLine();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        Account acc = new Account(accNum, name, balance);

        System.out.println("Account details:");
        acc.displayDetails();

        System.out.println("Enter amount to credit:");
        double creditAmount = sc.nextDouble();
        acc.credit(creditAmount);

        System.out.println("Enter amount to debit:");
        double debitAmount = sc.nextDouble();
        acc.debit(debitAmount);

        
        System.out.println("Name: Divyanshu Kumar, Roll Number: 2330441");


        sc.close();
    }
}
