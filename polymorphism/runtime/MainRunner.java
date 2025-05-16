package polymorphism.runtime;

class MainRunner {
	
	//1.DecideVehicle(new Car()); -> Vehicle obj = new Car() -> obj.start();
	//2. 1.DecideVehicle(new Bike()); -> Vehicle obj = new Bike() -> obj.start();
	static void decideVehicle(Vehicle obj) {
		obj.start();
	}
	
	public static void main(String[] args) {
		
		//1. UPcasting using method
		decideVehicle(new Car()); //rule 3
		decideVehicle(new Bike()); //rule 3
		
		System.out.println("---------------");
		
		//2. UPcasting using seperate reference Variable
		Vehicle v1 = new Car(); 
		v1.start();
		Vehicle v2 = new Bike();
		v2.start();
		
		
		System.out.println("--------");
		
		//3. UPcasting using single reference variable
		Vehicle v;
		v= new Car();
		v.start();
		v = new Bike();
		v.start();
		
	}

}
