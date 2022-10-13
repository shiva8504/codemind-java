import java.util.Scanner;
class intrest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int T=sc.nextInt();
        int R=sc.nextInt();
        System.out.print((P*T*R)/100);
    }
}