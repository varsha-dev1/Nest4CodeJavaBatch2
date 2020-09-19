import java.util.*;
public class RestaurantBill {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Price 1: ");
		float price1 = scan.nextFloat();
		System.out.print("Price 2: ");
		float price2 = scan.nextFloat();
		System.out.print("Price 3: ");
		float price3 = scan.nextFloat();
		System.out.print("tax %: ");
		float taxPercentage = scan.nextFloat();
		float sum = price1 + price2 + price3;
		float taxAmount = sum*(taxPercentage/100);
		
		float finalAmount = sum + taxAmount;
		System.out.println("Final Amount: "+ finalAmount);
		
	}

}
