package simplePrograms;

public class returnPractice {

	public static void main(String[] args) {
		int i, j, k;
		for (i=1; i<=3; i--)
		{
			if (i >=2)
			{
				System.out.println("yes");
				break;
			}
			else if (i <= 1)
			{
				System.out.println("no");
			return;
			}
		}
	}

}
