import java.util.Scanner;

public class HeightWeightConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Feet: ");
		int feet = scan.nextInt();
		System.out.print("Inch: ");
		int inch = scan.nextInt();
		System.out.print("Kg: ");
		int kg = scan.nextInt();
		
		int heightInInch = (feet*12)+inch;
//		float heightInCm = heightInInch * 2.54f;
//		float weightInPounds = kg * 2.2f;
		
		System.out.print("Height in cm: " + heightInInch * 2.54f);
		System.out.print("\nWeight in pounds: " + kg * 2.2f);
		

	}

}
