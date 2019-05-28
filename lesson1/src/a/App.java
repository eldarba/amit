package a;

public class App {

	public static void main(String[] args) {

		// these are references (pointers to objects)
		Person p1 = null; // points to Person and sub types (polimorphysm)
		Person p2 = null; // points to Person and sub types
		Employee e = null;// points to Employee and sub types

		// assign an object to the reference
		p1 = new Person(111, "Avi", 25);
		p2 = new Employee(222, "Dan", 44, 1500);
		e = new Employee(333, "Sarah", 33, 5000);
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
