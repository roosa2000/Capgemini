package lab1;
import java.util.*;
public class Excersise7 {
	
	static void checkNumber(int n)
	{
		boolean flag=false;
		int current=n%10;
		n=n/10;
		while(n>0)
		{
			if(current<=n%10)
			{
				flag=true;
				break;
			}
			current=n%10;
			n=n/10;
		}
		if(flag)
		{
			System.out.println("Number is not increasing");
		}
		else
		{
			System.out.println("Number is increasing");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		checkNumber(num);
		
	}

}
