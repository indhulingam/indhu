package INDHU;
import java.util.Scanner;
public class begin22 {
	public static void main(String[] args)
	{
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int temp=n;
     int  sum=0;
     while(n!=0)
     {
    	int a=n%10;
    	sum=(sum*10)+a;
    	n/=10;
     }
     if(temp==sum)
     {
       System.out.println("yes");
     }
     else
     {
    	 System.out.println("no");
     }
	
	}
}
