import java.util.Scanner;
class pnv
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        long n=sc.nextLong();
        while(n>0)
        {
            n=n/10;
            s++;
            if(s==10 && n==0)
            {
                s--;
            }
        }
        
        if(s==9)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}