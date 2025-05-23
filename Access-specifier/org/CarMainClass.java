package org;

//Accessing public members in different in different package
import com.Car;

public class CarMainClass {
	public static void main(String[] args) {
		System.out.println("Brand: "+Car.brand);
		Car c = new Car();
		System.out.println("Cost   --> "+c.cost);
	}
}
