public class ButterflyPattern {
	public static void main(String args[])
	{
		int r=8,c=8;
                int spaces = c-2;
        for(int i=1;i<=r/2;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
        spaces = 0;
        for(int i=r/2;i>=1;i--)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=spaces;k++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        
	}

}
