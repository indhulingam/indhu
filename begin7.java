package INDHU;
import java.util.Scanner;
public class begin6 {
	public static void main(String[] args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%4==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	
	scan.close();
	}
}
