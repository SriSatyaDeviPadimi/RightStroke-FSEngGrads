import java.util.Scanner;
import java.lang.Math;
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		int rem,num,count=0;
		num=a; 
		int num1=a;
		double result=0;
        while(num != 0)
        {
            num /= 10;
            ++count;
        }
		while(num1>0){
			rem=num1%10;
			result=result+Math.pow(rem,count);
			num1/=10;
		}
		if(result==a)
			System.out.println(a+" is an Armstrong number.");
		else
			System.out.println(a+" is not an Armstrong number.");
	}
}