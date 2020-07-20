import java.util.Scanner;

public class Palindrome{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= sc.nextInt();
		int n1=n,rem,res=0;
		while(n1>0){
			rem=n1%10;
			res=(res*10)+rem;
			n1/=10;
		}
		if(n==res)
			System.out.print(n+" is a Palindrome");
		else
			System.out.print(n+" is not a Palindrome");
	sc.close();
	}
}
