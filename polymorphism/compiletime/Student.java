package polymorphism.compiletime;

class Student {
	
	void Display(int age) {
		System.out.println("Age:"+age);
	}
	
	void Display(String name) {
		System.out.println("Name:"+name);
	}
	void Display( int age, String name) {
		System.out.println("Age:"+age+" Name:"+name);
	}
		
	void Display(String name, int age) {
		System.out.println("Name:"+name+" Age:"+age);
	}
}
