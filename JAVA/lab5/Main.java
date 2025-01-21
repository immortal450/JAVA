package lab5;

class Person {
	void name() {
		System.out.println("Name is Divyanshu");
	}
}

class Student extends Person {
	void roll() {
		System.out.println("Roll is 2330441");
	}
}

class Teacher extends Person {
	void empid() {
		System.out.println("ID is 2 year student");
	}
}

public class Main {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.empid();
		t.name();
	}
}