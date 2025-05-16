package polymorphism.runtime;

class Vehicle {
	
	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Car started");
	}
}

class Bike extends Vehicle{
	
	@Override
	void start() {
		System.out.println("Bike started");
	}
	
}
