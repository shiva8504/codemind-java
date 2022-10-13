import java.util.Scanner;
class sol
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float v;
        v=sc.nextInt();
        double a=(double)(v-32)/1.8;
        System.out.format("%.2f",a);
    }
    
}