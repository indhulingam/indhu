public class possitiveornegative {
	public static void main(String[] arga){
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n>0){
			System.out.println("possitive");
		}
		else if(n<0)
		{
			System.out.println("negative");
			
		}
		else
		{
			System.out.println("Zero");
		}
		scan.close();
	}

}
