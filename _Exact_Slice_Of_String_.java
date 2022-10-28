import java.util.Scanner;
class exact_slice{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String ab=sc.nextLine();
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(ab.substring(a,b+1));
	}
}