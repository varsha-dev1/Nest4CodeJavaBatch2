// Batch2 Day3 Problem2

import java.util.Scanner;
public class ExchangeCharactersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
		String s1 = sc.next();
		System.out.print("String 2: ");
		String s2 = sc.next();	
		System.out.println("Output String 1: "+s2.substring(s2.length()-2)+s1.substring(2,s1.length()-2)+s2.substring(0,2));
		System.out.println("Output String 2: "+s1.substring(s1.length()-2)+s2.substring(2,s2.length()-2)+s1.substring(0,2));
		sc.close();
	}
}
