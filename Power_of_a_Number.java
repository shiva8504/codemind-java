import java.util.Scanner;
class pan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((int)(Math.pow(a,b))%c);
    }
}