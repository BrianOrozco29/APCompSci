package simplePrograms;
import java.util.Scanner;
public class Economics {

	public static void main(String[] args) {
		System.out.println("What is your median yearly income?");
		Scanner inc = new Scanner(System.in);
		int income = inc.nextInt(); 	//per year
     	int potential = 0;
     	for (int x = 22; x <= 62; x += 1)	{
		potential += income;
	}
     	System.out.println("Your income potential is $" + potential + " by the time you reach 62 years of age");

	}

}
