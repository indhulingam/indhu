package INDHU;
import java.util.Scanner;
public class play1 {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String[] a=s.split(" ");
		String m="";
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length()-1;j>=0;j--)
			{
			m=m+a[i].substring(j,j+1);
			}
		}
		System.out.println(m);
		
	}
}
