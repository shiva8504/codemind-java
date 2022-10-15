import java.util.Scanner;
class dd{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a%k!=0){
                c++;
            }
        }
        System.out.print(c);
        
    }
}