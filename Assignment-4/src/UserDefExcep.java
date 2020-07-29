import java.util.Scanner;

class PayOutOfBoundsException extends Exception{}
public class UserDefExcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount to be paid : ");
		int basicpay = sc.nextInt();
		sc.close();
		try {
			if(basicpay>=10000 && basicpay <= 30000) 
				System.out.print("Thank you for selecting the correct amount ! ");
			else 
				throw new PayOutOfBoundsException();
		}
		catch(PayOutOfBoundsException e) {
			if(basicpay<10000)
				System.out.println("Your Amount is less than 10,000!");
			else 
				System.out.println("Your Amount is greater than 30,000!");
		}
	}

}
