import java.util.Scanner; 
public class pat1 
{
    public static void pat(int n)
    {
        int nsp=n-1;
        int nst=1;
        for(int i=n;i>=1;i--)
        {
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;cst++)
            {
                    System.out.print(cst+"\t");
            }
            nsp--;
            nst+=2;
            System.out.println(); 
        }
        
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        pat(n);

    }
    
}
