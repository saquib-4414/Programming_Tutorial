import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("give your number ");
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
		int sc=scan.nextInt();
		System.out.println("print all odd numbers untill "+sc);
		
		for(int i=1;i<=sc;i++)
			if(i%2==1)
			{
				
				System.out.print(" "+i);
			}
		
		
}
}