package a;

public class Employee extends Person {
	
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age); // invoke super (Person) CTOR
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
