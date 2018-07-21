package INDHU;
import java.util.Scanner;
public class begin24 {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	for(int i=n+1;i<k;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
		  if(i%j==0)
		   {
			count++;
		   }
		}
		if(count==2)
		{
			System.out.println(i);
		}
	}
		
	
	}
}
