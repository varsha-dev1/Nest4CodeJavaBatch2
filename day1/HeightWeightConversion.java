// Batch2 Day2 Problem2

import java.util.Scanner;
public class HeightWeightConversion 
{
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		System.out.print("Feet: ");
		int feet = scan.nextInt();
		System.out.print("Inch: ");
		int inch = scan.nextInt();
		System.out.print("Kg: ");
		int kg = scan.nextInt();		
		int heightInInch = (feet*12)+inch;		
		System.out.print("Height in cm: " + heightInInch * 2.54f);
		System.out.print("\nWeight in pounds: " + kg * 2.2f);
	}
}
