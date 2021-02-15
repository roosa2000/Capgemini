package lab1;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		int cube=0;
		int sum=0;
		for(int i=1; i<num+1;i++)
		{
			cube=i*i*i;
			sum=sum+cube;
		}
		System.out.print("Sum of cubes is: "+sum);

	}

}
