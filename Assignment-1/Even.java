import java.util.Scanner;
class Even{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Even number with in the range \nEnter the starting range : ");
		int n = sc.nextInt();
		System.out.print("Enter the ending Range : ");
		int n1 = sc.nextInt();
		System.out.println("Even numbers between "+n+" and "+n1+" is as follows : ");
		for(int i=n;i<n1;i++){
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}