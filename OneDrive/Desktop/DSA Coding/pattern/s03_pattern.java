import java.util.Scanner; 
public class s03_pattern
{
    public static void pattern03(int n)
    {
        int nst = n;
        for(int i = 1; i<=n; i++)
        {
            for(int cst =1; cst<=nst; cst++)
            System.out.print("*\t");
            nst--;
            System.out.println();

        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        pattern03(n);
    }
}
