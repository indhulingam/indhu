package INDHU;
import java.util.Scanner;
public class begin24 {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int k=scan.nextInt();
	for(int i=n+1;i<k;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
}
}
