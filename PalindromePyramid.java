public class PalindromePyramid
{
	public static void main(String[] args) {
		int r = 5, c = 5;
		for(int i=1;i<=r;i++)
		{
		    for(int j=1;j<c;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    for(int j=2;j<=i;j++)
		    {
		        System.out.print(j);
		    }
		    c--;
		    System.out.println();
		    
		}
	}
}
