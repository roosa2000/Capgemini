package lab1;

import java.util.Scanner;

public class Excercise5 {
	
	static void calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("the sum is: "+sum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		calculateSum(num);
		

	}

}
