package INDHU;
import java.util.Scanner;
public class play33 {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int sum=0;
	int a;
	while(n!=0)
	{
     a=n%10;
    sum=(sum*10)+a;
     n/=10;
     }
	System.out.println(sum);
	}
}
