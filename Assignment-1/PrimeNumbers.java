import java.util.Scanner;
class PrimeNumbers{
	boolean isPrime(int p){
		int temp;
		boolean isPri=true;
		for(int i=2;i<=p/2;i++){
			temp=p%i;
			if(temp==0){
				isPri=false;
				break;
			}
		}
		return isPri;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrimeNumbers pn=new PrimeNumbers();
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			if(pn.isPrime(i))
				System.out.println(i);
		}
	}
}