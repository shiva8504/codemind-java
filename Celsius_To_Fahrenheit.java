import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float v;
        v=sc.nextFloat();
        double a=(double)(v*9/5)+32;
        System.out.format("%.2f",a);
    }
    
}