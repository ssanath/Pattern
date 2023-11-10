public class ButterflyPattern {
	public static void main(String args[])
	{
		int r=10;
        int spaces;
        for(int i=1;i<=r/2;i++)
        {
        	spaces = 2*((r/2)-i);
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
        }
        for(int i=r/2;i>=1;i--)
        {
        	spaces = 2*((r/2)-i);
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
        }
        
	}

}
