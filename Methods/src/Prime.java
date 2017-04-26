import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter a number to check: ");
		//todo: write a method which tells you if a given number is a prime or not
		
	int T;
	boolean Prm=true;
	int N=scan.nextInt();
	
	for(int i = 2;i<N;i++)
	{
		T=N%i;
		if(T==0)
		{
			Prm=false;
			break;
		}
		
	}
		if(Prm)
			System.out.println(N+" is a prime number");
		else
			System.out.println(N+" is not a prime number");
	
}
}