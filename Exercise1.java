package exercises8.blah;
import java.util.Scanner;
public class Exercise1 {

	public static String Backwards (String a) {
		/*Exercise 8.1. Write a method that takes a String as an argument and that
		prints the letters backwards all on one line.*/
		int i;
		String yes = "";

		for (i = a.length() - 1; i>= 0; i--)
		{
		char x = a.charAt(i);	
		yes = yes+x;
		}
		return yes;
	}
	
	public static void main(String[] args) {
	System.out.println("I can say anything you type backwards. Go Ahead!");
	Scanner flip = new Scanner(System.in);
		String a = flip.nextLine();
		System.out.print(Backwards(a));
	}
}