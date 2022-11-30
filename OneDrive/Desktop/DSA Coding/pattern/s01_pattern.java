
import java.util.Scanner; 
public class s01_pattern
{
    public static void patter01(int n)
    {
        int nsp = n , nst =n ;
        for(int i = 1; i<=n; i++)
        {
            for(int csp = 1 ; csp<=nsp ; csp++)
             System.out.print("_\t");
             for(int cst = 1 ; cst<= nst; cst++)
             System.out.print("*\t");
             System.out.println();

        }

    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        patter01(n);
    }
}