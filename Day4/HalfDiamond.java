// Batch2 Day4 Problem2

import java.util.Scanner;
public class HalfDiamond 
{
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int t = 2;
		for(int i=1; i<=(num*2)-1;i++)
		{
			if(i<=num)
			{
				for(int j = 1; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(int l = 1; l<=i-t; l++)
				{
					System.out.print("*");
				}
				t=t+2;
				System.out.println();
			}
		}
		sc.close();		
	}
}



