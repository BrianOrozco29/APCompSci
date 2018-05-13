package simplePrograms;

public class forLoopPractice {

	public static void main(String[] args) {
		/*Exercise 1: Write a Java program by using two for loops to produce the output shown below:
		*******
		******
		*****
		****
		***
		**
		* 																							*/
		int i, j;
		for (i = 1; i<=7; i++)
		{
			for (j = 7; j>=i; j--)		
			{	
			System.out.print("*");
			}
		System.out.println();
		}
}
}
