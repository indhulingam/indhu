package INDHU;
import java.util.Scanner;
public class bedgi10 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		while(n!=0)
		{
		int a=n%10;
		n/=10;
		count++;
		}
		System.out.println(count);
	}

	}
