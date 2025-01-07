package lab_1;
import java.util.Scanner;

class Java1 {
    public static void main(String[] args) {
        String name, branch, department, university;
        int rollNumber;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:");
        name = sc.nextLine();
        
        System.out.println("Enter your Roll Number:");
        rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Branch:");
        branch = sc.nextLine();

        System.out.println("Enter your Department:");
        department = sc.nextLine();

        System.out.println("Enter your University:");
        university = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Department: " + department);
        System.out.println("University: " + university);
    }
}