package LAB;
import java.util.Scanner;

class UniMember {
    String name;
    String gender;

    void setDetails(String n, String g) {
        name = n;
        gender = g;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends UniMember {
    int rollNumber;

    void setStudentDetails(String n, String g, int r) {
        setDetails(n, g);
        rollNumber = r;
    }

    void displayStudentDetails() {
        displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Faculty extends UniMember {
    int employeeId;

    void setFacultyDetails(String n, String g, int e) {
        setDetails(n, g);
        employeeId = e;
    }

    void displayFacultyDetails() {
        displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Faculty Details:");

        Student student = new Student();
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String studentName = sc.nextLine();
        System.out.print("Gender: ");
        String studentGender = sc.nextLine();
        System.out.print("Roll Number: ");
        int studentRoll = sc.nextInt();
        sc.nextLine();
        student.setStudentDetails(studentName, studentGender, studentRoll);

        Faculty faculty = new Faculty();
        System.out.println("\nEnter Faculty Details:");
        System.out.print("Name: ");
        String facultyName = sc.nextLine();
        System.out.print("Gender: ");
        String facultyGender = sc.nextLine();
        System.out.print("Employee ID: ");
        int facultyId = sc.nextInt();
        faculty.setFacultyDetails(facultyName, facultyGender, facultyId);

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();

        System.out.println("\nFaculty Details:");
        faculty.displayFacultyDetails();
    }
}
