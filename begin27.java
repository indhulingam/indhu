package INDHU;
import java.util.Scanner;
public class begin27 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0){
		int a=n%10;
		n/=10;
		sum=sum+(a*a*a);
		}
		if(temp==sum){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}	
	}
}
