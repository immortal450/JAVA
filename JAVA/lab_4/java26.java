package LAB;
import java.util.Scanner; 
class Shape {
String name;
static class Square { 
    int side;
int sqArea () {
return side * side;
}
}
static class Rectangle {
int width;
int height;
int recArea () {
return width * height;
}
}
public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in); 
    System.out.print ("Enter shape name: "); 
    String str = sc.nextLine();
    Shape dk= new Shape();
    dk.name = str;
    if dk.name.equals("Square") || dk.name.equals("square")) {
    
    Square sq = new Square ();
    System.out.print ("Enter the side of square: "); 
    sq.side = sc.nextInt();
    System.out.print ("Name:Divyanshu Kumar\nRoll no.:2330441\n");
    System.out.println("Area of square: " + sq.sqArea());
    }
    else if (dk.name.equals("Rectangle") || dk.name.equals("rectangle")) {
    Rectangle rec = new Rectangle();
    
    System.out.print ("Enter width: "); 
    rec.width = sc.nextInt();
    System.out.print ("Enter height: ");
    rec.height = sc.nextInt();
    System.out.print ("Name:Divyanshu Kumar\nRoll no.:2330441\n");
    System.out.println("Area of rectangle: "+ rec.recArea ());
    }
    else {
    System.out.println("Invalid shape entered!");
    }
    }
}