package polymorphism.compiletime;

class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
		
		s1.Display(22);
		s1.Display("Hanif");
		s1.Display(24, "Sam");
		s1.Display("iggi", 23);
		
	}
}
