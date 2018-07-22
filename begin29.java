package INDHU;
import java.util.Scanner;
public class begin29 {
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		long n=scan.nextInt();
		long sum=1;
		for(long i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}

}
