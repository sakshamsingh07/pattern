import java.util.Scanner;
public class s05_pattern_daimond
{
    public static void pattern05(int n)
    {
        int nsp =(n-1)/2 , nst = 1 ;
        for(int i = 1; i<= n; i++)
        {
             for(int csp = 1; csp<=nsp; csp++)
            System.out.print("\t");
            for(int cst = 1; cst<=nst; cst++)
            System.out.print("*\t");
            if(i<=n/2)
            {
                nsp --;
                nst +=2;
            }
            else
            {
                nsp ++;
                nst -=2;
            }
            System.out.println();

        }
    }
    public static void main(String[] arg)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern05(n);
    }
} 
