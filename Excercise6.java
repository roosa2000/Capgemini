package lab1;
import java.util.*;
public class Excercise6 {

	static void calculateDifference(int n)
	{
		int s1=0;
		int s2=0;
		int diff=0;
		for(int i=1;i<=n;i++)
		{
			int a=i*i;
			s1=s1+a;
			
			s2=s2+i;
			int b=s2*s2;
			
			diff=s1-b;
		}
		System.out.println("The difference is: "+diff);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		calculateDifference(num);

	}

}
