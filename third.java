package indhu;
import java.util.Scanner;
public class third {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int l=0;
	int count=0;
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();	
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]==i)
		{
			b[l]=a[i];
			l++;
			count++;
		}
	}
          if(count!=0)
          {
		    for(int i=0;i<count;i++)
	        {
		      System.out.println(b[i]);
	        }
          }

	     else
		  {
		    System.out.println("-1");
		  }
}
}
