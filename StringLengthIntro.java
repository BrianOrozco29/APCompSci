package simplePrograms;
import java.util.Scanner; 
public class StringLengthIntro {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String myName;
			System.out.println("Please enter your name: ");
			myName = sc.nextLine();
		int nameLength;
			nameLength = myName.length();
			System.out.println("Hello, " + myName + ".");
			System.out.println("There are " + nameLength + " letters in your name.");

	}

}
