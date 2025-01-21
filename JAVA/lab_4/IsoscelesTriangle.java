package LAB;
import java.util.Scanner;


public class IsoscelesTriangle {
    double base;
    double side;
    public IsoscelesTriangle(double base, double side) {
        this.base = base;
        this.side = side;
    }
    public double calArea() {
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(base / 2, 2));
        return (base * height) / 2;
    }
    public double calPerimeter() {
        return 2 * side + base;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     double side,base;
     System.out.print("Enter the value of the side: ");
     side= sc.nextInt ();
     System.out.print("Enter the value of the base: ");
     base= sc.nextInt ();
        IsoscelesTriangle triangle = new IsoscelesTriangle( side,base);
    if (2*side>=base){
        
        double area = triangle.calArea();

        System.out.print("Name:Shahriyar Taufik\nRoll no.:2330111\n");
        System.out.println("Area of the isosceles triangle: " + area);
        double perimeter = triangle.calPerimeter();
        System.out.println("Perimeter of the isosceles triangle: " + perimeter);
    }
    else {
        
    System.out.println("Invalid input of side and base thus its not an triangle");
}
}
}