package javabean;

public class HotelMainClass {
	public static void main(String[] args) {
		Hotel h = new Hotel();
		
		h.setName("Taj");
		h.setRatings(5);
		
		System.out.println("Hotel Name: "+h.getName());
		System.out.println("Hotel Ratings: "+h.getRatings());
	}
}
