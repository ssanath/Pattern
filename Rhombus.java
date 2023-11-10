public class Rhombus {
	public static void main(String args[])
	{
		int stars = 5;
		int spaces;
		for(int i=1;i<=stars;i++)
		{
			spaces = stars-i;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
