package assignment1;

public abstract class Person {
	
	private String id; // represent person's ID
	private String name; // represent person's name
	private int age; // represent person's age
	private String state; //represent person's state
	
	// Person's constructor
	public Person(String id, String name, int age, String state) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
	}
	
	// get person's ID
	public String getID() {
		return id;
	}

	//get person's name
	public String getName() {
		return name;
	}
	
	//get person's age
	public int getAge() {
		return age;
	}

	// get person's state
	public String getState() {
		return state;
	}
	

}
