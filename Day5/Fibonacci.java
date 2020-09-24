// Batch2 Day5 Problem1

import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		arr[0]=0;
		arr[1]=1;
		System.out.print(arr[0]+" "+arr[1]+" ");		
		for(int i=2 ; i < num ; i++)
		{			
			arr[i]=arr[i-2]+arr[i-1];			
			System.out.print(arr[i]+" ");			
		}
		sc.close();		
	}
}
