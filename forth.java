import java.util.Scanner;
public class b {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int k=0;
         for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					count++;
				}
			}
			if(count==0)
			{
				b[k]=a[i];
				k++;
				
			}
			
			
		}
			
		     for(int j=0;j<k;j++)
		     {
			System.out.println(b[j]);
		     }
			
	}
	

}
