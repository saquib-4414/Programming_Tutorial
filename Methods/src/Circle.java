import java.util.Scanner;

public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	static Scanner sc= new Scanner(System.in)  ;
	
	public static void main(String args[])
	{
		System.out.print("Enter the Radius:");
		
		double r=sc.nextDouble();
		
		double diameter=2*r;
		System.out.println("The diameter is: " +diameter);
		

		double circumference=2*Math.PI*r;
		System.out.println("The circumference is: " +circumference);
		
		double area= Math.PI*(r*r);
		System.out.println("The area is: " +area);
		
		
		
	}
}
