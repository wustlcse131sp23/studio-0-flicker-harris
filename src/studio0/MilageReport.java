package studio0;

public class MilageReport {
	
	public static void main(String[] args) {
		int car1miles = 250;
		int car2miles = 100;
		int car3miles = 900;
		
		int totalMiles = car1miles + car2miles + car3miles;
		double gallonsperMile = 1/24.5;
		double totalGallons = totalMiles * gallonsperMile;
		double priceperGallon = 3.05;
		double totalPrice = totalGallons * priceperGallon;
		
		System.out.println("Total price spent on gas was $" + totalPrice);
	}
}
