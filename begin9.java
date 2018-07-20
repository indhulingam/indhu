package INDHU;
import java.util.Scanner;
public class begin9 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int sum=0,sum1=0;
		int n=scan.nextInt();
		int j=0;
		int k=scan.nextInt();
		int a[]=new int[n];
		for(int i=n;i>0;i--)
		{
		 a[j]=i;
			j++;
		}
		
		for(int i=k;i>=0;i--)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
	}
	

}
