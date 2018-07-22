package INDHU;
import java.util.Scanner;
public class begin10 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=n*5;
		int a[]=new int[b];
		int j=0;
		for(int i=n;i<=b;i=i+n)
		{
			a[j]=i;
			j++;
		}
		for(int k=0;k<5;k++)
		{
			System.out.println(a[k]);
		}
	}

}
