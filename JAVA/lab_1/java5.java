package lab_1;
import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {

        int totalSeconds, hours, remainingSeconds, minutes, seconds ;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Divyanshu Kumar");
        System.out.println("Roll No:2330441");
        System.out.print("Enter the number of seconds: ");
        totalSeconds = sc.nextInt();
        hours = totalSeconds / 3600;
        remainingSeconds = totalSeconds % 3600;
        minutes = remainingSeconds / 60;
        seconds = remainingSeconds % 60;
        System.out.printf("Equivalent time: %d hours, %d minutes, %d seconds%n", hours, minutes, seconds);
    }
}