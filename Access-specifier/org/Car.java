package org;

import com.Vehicle;

class Car extends Vehicle {
	
	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println(c.brand);
		
		c.start();
	}

}
