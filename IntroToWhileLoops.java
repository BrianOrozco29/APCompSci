package simplePrograms;

public class IntroToWhileLoops {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
	while (i <= 1000)
	{	
		if (i%7==0)		
		{
			System.out.println(i + " is a multiple of 7");
			count++;
		}
		i++;
		
	}
	System.out.println("There are " + count + " multiples of 7");
}
}