import java.util.Scanner;
class pn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                r++;
            }
        }
        if(r==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}