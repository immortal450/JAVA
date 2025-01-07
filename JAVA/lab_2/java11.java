package lab_2;
import java.util.Scanner;

class java11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The given number " + number + " is Positive.");
        } else if (number < 0) {
            System.out.println("The given number " + number + " is Negative.");
        } else {
            System.out.println("The given number is Zero.");
        }
    }
}
