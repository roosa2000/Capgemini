package lab1;
import java.util.*;
public class Excersise8 {
	
	public boolean checkNumber(int n)
	{
		if(n<=0)
		{
			return false;
		}
		
		while(n>1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
			
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Excersise8 obj=new Excersise8();
		System.out.println(obj.checkNumber(num));

	}

}
