package a; // package declaration

// import declarations

// class declaration
public class Person {

	// fields:
	// instance variables - attributes - dynamic (belongs to instances)
	private final int id; // final - unchanging after init
	private String name;
	private int age;
	// class variables - static (belongs to class
	private static int counter;
	private static final int MAX_AGE = 120; // constant

	// ======================================
	// CTORs
	public Person(int id, String name, int age) {
		super();
		this.id = id; // this is a reference to the current object
		this.name = name;
		setAge(age);
	}

	// ======================================
	// methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // this is a reference to the current object
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= MAX_AGE) {
			this.age = age;
		}
	}

	// dynamic method - belong to instance [p1.getCounter()]
	public int getId() {
		return id;
	}

	// static method - belong to class [Person.getCounter()]
	public static int getCounter() {
		return counter;
	}

	// method signature is of 3 parts
	// 1. return type
	// 2. identifier (method name)
	// 3. parameters (what the method gets from invoker)
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
}

/*
 * static, final, private, public, protected, abstract, synchronized - are all
 * modifiers.
 * 
 * modifiers are keywords that we put next to members to give them certain
 * attributes (behaviors)
 * 
 */
