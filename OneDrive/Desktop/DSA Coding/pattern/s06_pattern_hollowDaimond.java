import java.util.Scanner; 
public class s06_pattern_hollowDaimond
{
    public static void pattern(int n)
    {
        int nsp =1 , nst= (n+1)/2 ;
        for( int i = 1; i<=n; i++)
        { 
            for(int cst= 1 ; cst<=nst; cst++)
            System.out.print("*\t");
            for(int csp=1; csp<=nsp; csp++)
            System.out.print("\t");
            for(int cst=1; cst<=nst; cst++)
            System.out.print("*\t");
            if(i<=n/2)
            {
                nst--;
                nsp+=2;
            }
            else
            {
                nst++;
                nsp-=2;
             }
             System.out.println();
        }
    }
    public static void main(String[] args )
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern(n);
    }
}
