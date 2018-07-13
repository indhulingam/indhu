
public class vhgk {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=0,temp=0;
		int a[]=new int [n];
		int b[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n-1;i++)
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
			if(count>0)
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		if(k!=0)
		{
		for(int m=0;m<k;m++)
		{
			System.out.println(b[m]);
		}
		}
		else
		{
			System.out.println("unique");
		}
		scan.close();
	}
}



