package INDHU;
import java.util.Scanner;
public class begin3 {
	public static void main(String [] args)
	{
		char c;
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		if(((c>=65) && (c<=90)) || ((c>=97) && (c<=122)))
		{
				System.out.println("Alphabet");
		}
			else
			{
				System.out.println("No");
			}
		
	}

}
