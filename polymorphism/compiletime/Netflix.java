package polymorphism.compiletime;

class Netflix {
	
	static void login(String email, String pass) {
		System.out.println("Logged in using email and password");
	}
	
	static void login(int mobile, int otp) {
		System.out.println("logged in usung Mobile no and otp");
	}
	
	public static void main(String[] args) {
		login("dummy@gmail.com", "Password");
		System.out.println("--------");
		Netflix.login(98265, 258);
	}
}

