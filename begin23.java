package INDHU;
import java.util.Scanner;
public class begin223 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int count=0;
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
