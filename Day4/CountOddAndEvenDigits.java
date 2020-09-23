// Batch2 Day4 Problem1

import java.util.Scanner;
public class CountOddAndEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		long num = sc.nextLong();		
		if(num<0)
		{
			num=num*(-1);
		}
		int even = 0; 
	    int odd = 0; 
	    while (num>0)  
	    { 
	        long remainder = num%10; 
	        if (remainder%2 == 0)
	        {
	        	even=even+1;
	        }
	            
	        else
	        {
	        	odd=odd+1;
	        }	             
	        num = num/10; 
	    } 
	    System.out.println ( "Odd digit: " + odd); 
	    System.out.println ( "Even digit: " + even); 
	    sc.close();
	}
}
