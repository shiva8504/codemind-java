import java.util.*;
class Java{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        c = sc.next().charAt(0);
      
        if(c=='r' || c=='R'){
            System.out.print("Red");
        }
         else if(c=='v' || c=='V'){
            System.out.print("Violet");
        }
        else if(c=='i' || c=='I'){
            System.out.print("Indigo");
        }
         else if(c=='b' || c=='B'){
            System.out.print("Blue");
        }
        else if(c=='G' || c=='g'){
            System.out.print("Green");
        }
         else if(c=='y' || c=='Y'){
            System.out.print("Yellow");
        }
        else  if(c=='O' || c=='o'){
            System.out.print("Orange");
        }
        else{
            System.out.print("-1");
        }
        
        
        
    }
}