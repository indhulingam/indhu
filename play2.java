package INDHU;
import java.util.Scanner;
public class play2 {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=1;
		if(n<=20)
		{
			if(n==0)
			{
				System.out.println("1");
			}
			else
			{
				for(int j=1;j<=n;j++)
				{
				sum=sum*j;	
				}
				System.out.println(sum);	
			}
		  }
			else
			{
			System.out.println("Invalid Input");
		    }
		}	
	}

