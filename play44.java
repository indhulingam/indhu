package INDHU;
import java.util.Scanner;
public class play44 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String n=s.substring(s.length()-1);
		if(!(n.equals(".")))
		  {
			   System.out.print(s+".");
			        
		  }
		else
		 {
		 
            System.out.println(s);			
		 }
}
}
