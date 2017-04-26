import java.util.Scanner;
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter the number: ");
		n=sc.nextInt();
		int factorial=fact(n);
		System.out.println("the factorial is: "+factorial);
		
	}
	
static int fact(int n)
{
	int calc;
	if(n==1)
	{
		return 1;
	}
	
	calc=fact(n-1)*n;
	 return calc;
}

}
