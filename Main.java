/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String[] args) {
        int r = 5,k=0,i=0,num=0;
        int c = r;
        for(i=1;i<=r;i++)
        {
            for(int j=1;j<c;j++)
            {
                System.out.print(" ");
            }
            k=1;
            num = 1;
            while(k<=i)
            {
                if(num % 2 != 0)
                {
                    System.out.print(i);
                    k++;
                }
                else
                {
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
            c--;
        }
    }
}
