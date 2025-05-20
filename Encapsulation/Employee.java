package javabean;

public class Employee {
	
	private String name;
	private int id;
	
	//setter method
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//getter method
	public int getId() {
		return id; 
	}
	
	public String getName() {
		return name;
	}

}
