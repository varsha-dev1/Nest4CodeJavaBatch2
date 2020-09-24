// Batch2 Day5 Problem2

import java.util.Scanner;
public class NextPrime 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		num=num+1;		
		NextPrime primeObj = new NextPrime();
		primeObj.nextPrime(num);
		
		sc.close();		
	}
	public void nextPrime(int n)
	{
		boolean b=true;	
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				b=false;
			}
		}
		if(b!=false)
		{
			System.out.print("Next Prime: "+n);
			
		}	
		else
		{
			nextPrime(n+1);
		}
	}

}
