package simplePrograms;
import java.util.Scanner;
public class VolumeOrArea {

	public static void main(String[] args) {
	Scanner geo = new Scanner(System.in);	
		double b1;
		double b2;
		double h;
		double r;
		double w;
	System.out.println("Enter either \"volume\" or \"area\".");
		String formula = geo.nextLine();

		if (formula.equalsIgnoreCase("volume"))
		{	System.out.println("Do you want a pyramid, a cylinder, or a rectangular prism?");
			String shape = geo.nextLine();
				if (shape.equalsIgnoreCase("pyramid"))
				{	System.out.println("Enter a base, then enter a height.");
					b1 = geo.nextDouble();
					h = geo.nextDouble();
					System.out.println((b1*h)/3 + " cubic units");	
				}
				else if (shape.equalsIgnoreCase("cylinder"))
				{	System.out.println("Enter the radius, then enter the height.");
					r = geo.nextDouble();
					h = geo.nextDouble();
					System.out.println(3.14*h*r*r + " cubic units");
				}
				else if (shape.equalsIgnoreCase("rectangular prism"))
				{	
					b1 = geo.nextDouble();
					h = geo.nextDouble();
					w = geo.nextDouble();
					System.out.println(b1*h*w);
				}
				else 
					System.out.println("Error! Try Again.");
			}
		else if (formula.equalsIgnoreCase("area"))
		{	System.out.println("Do you want a trapezoid, a triangle, a circle, or a square?");
			String shape = geo.nextLine();
				if (shape.equalsIgnoreCase("trapezoid"))
				{ 	System.out.println("Enter base 1, then base 2, then the height.");
					b1 = geo.nextDouble();
					b2 = geo.nextDouble();
					h = geo.nextDouble();
					System.out.println((b1+b2)/2 *h + " square units");
				}
				else if (shape.equalsIgnoreCase("triangle"))
				{	System.out.println("Enter a base, then a height.");
					b1 = geo.nextDouble();
					h = geo.nextDouble();
					System.out.println(0.5*b1*h + " square units");
				}
				else if (shape.equalsIgnoreCase("circle"))
				{	System.out.println("Enter the radius.");
					r = geo.nextDouble();
					System.out.println(3.14*r*r + " square units");
				}
				else if (shape.equalsIgnoreCase("square"))
				{	System.out.println("Enter the height.");
					h = geo.nextDouble();
					System.out.println(h*h);
				}
				else
					System.out.println("Sorry! Try Again.");
		}
		else
		{	System.out.println("Java self-destruct sequence...ENGAGE!");

		}
		}
}
	
		
		

