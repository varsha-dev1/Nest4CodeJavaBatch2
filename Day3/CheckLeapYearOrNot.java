// Batch2 Day3 Problem3

import java.util.Scanner;
public class CheckLeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Date: ");
		int date = sc.nextInt();
		if(date%400==0)
		{			
			System.out.print("Date in Leap Year");
		}
		else if(date%4==0 && date%100 != 0) 
		{
			System.out.print("Date in Leap Year");
		}
		else 
		{
			System.out.print("Date Not in Leap Year");
		}
		sc.close();
	}
}
