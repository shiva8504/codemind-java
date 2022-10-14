import java.util.Scanner;
class nn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*n;
        int b=0;
        while(a>0)
        {
            b+=(a%10);
            a=a/10;
        }
        if(b==n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}