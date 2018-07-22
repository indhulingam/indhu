package INDHU;
import java.util.Scanner;
public class begin27 {
	public static void main(String[] args){
      int n, sum = 0, temp, remainder, digits = 0;
 
      Scanner in = new Scanner(System.in);     
      n = in.nextInt();
 
      temp = n;
 
      while (temp != 0) {
         digits++;
         temp = temp/10;
      }
 
      temp = n;
 
      while (temp != 0) {
         remainder = temp%10;
         sum = (int) (sum + Math.pow(remainder, digits));
         temp = temp/10;
      }
 
      if (n == sum)
         System.out.println("yes");
      else
         System.out.println("no");         
   }
 
   }


