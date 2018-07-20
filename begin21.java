package INDHU;
import java.util.Scanner;
public class begin21 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
        long result = 1;
        while (k != 0)
        {
            result *= n;
            --k;
        }
        System.out.println(result);
		
	}

}
