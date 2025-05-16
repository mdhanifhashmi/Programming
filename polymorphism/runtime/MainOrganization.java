package polymorphism.runtime;

class MainOrganization {
	
	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {
		
		//1. Using Static Method
		display(new Developer());
		display(new Tester());
		
		System.out.println("------------");
		
		//2. Upcasting using Seperate reference Variable
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		
		System.out.println("------------");
		
		// UPcasting using single reference Variable
		Employee e;
		e = new Developer();
		e.work();
		e= new Tester();
		e.work();
		
	}
}
