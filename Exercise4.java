package lab1;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.print("Prime number: ");
				System.out.println(i);
			}
		}

	}

}
