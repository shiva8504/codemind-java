import java.util.Scanner;
class sol
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>0)
        {
            System.out.printf("Positive Number");
        }
        else
        {
            System.out.printf("Negative Number");
        }
    }
}