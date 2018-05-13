package arrays;

import java.util.Scanner;

public class CompareArrays {
	public static void main(String [] args) {
		int i;
		int length;
		Scanner brian = new Scanner(System.in);
		String a,b,c;
		System.out.println("Enter two words: ");
		a = brian.nextLine();
		b = brian.nextLine();

		
		String[] list = {a, b};
		
		if (a.length() > b.length()) {
			System.out.println(a + " is bigger");
		}
		
		else if (a.length() == b.length()){
			System.out.println("Both words are the same length.");
		}
		
		
		else {
			System.out.println(b+ " is bigger");
		}
	}
}
