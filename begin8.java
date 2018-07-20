package INDHU;
import java.util.Scanner;
public class naturlnumbers {
public static void main(String[] args)
{
	int sum=0;
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for(int i=n;i>=0;i--)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
