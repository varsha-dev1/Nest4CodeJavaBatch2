// Batch2 Day4 Problem3

import java.util.Scanner;
public class PalindromeOrNot 
{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String pal = sc.nextLine();
		int len = pal.length();
		int count=0;
		for(int i = 0; i <pal.length()/2; i++)
		{
			if(pal.charAt(i) != pal.charAt(len-1))
			{
				count=1;
			}
			len=len-1;
		}
		if(count == 1)
		{
			System.out.println("Is not Palindrome");
		}
		else
		{
			System.out.println("Is Palindrome");
		}sc.close();
	}
}
