package INDHU;
import java.util.Scanner;
public class begin28{
public static void main (String args[])
{
int rem,p=0,temp,c=0;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
for(int i=x+1;i<y;i++)
{
   temp=i;
   while(temp!=0)
   {
	c++;
	temp/=10;
   }
   temp=i;
   while(temp!=0)
   {
    rem=temp%10;
    p=(int) (p+Math.pow(rem,c));
    temp=temp/10;
   }
   if(i==p)
   {
    System.out.println(i);
   }
   c=0;
   p=0;
}
}
}


