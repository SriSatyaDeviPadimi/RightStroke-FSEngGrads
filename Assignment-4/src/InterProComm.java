import java.util.Scanner;
class Customer{
	int amount =10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw....  Amount is : "+amount);
		if(this.amount<amount) {
			System.out.println("Less balance; Waiting to deposit ...");
			try {
				wait();
			}
			catch(Exception e) { }
		}
		else {
			this.amount-=amount;
			System.out.println("Withdraw Completed.....\nReamining Balance is : "+this.amount);
		}
	}
	
	synchronized void deposit(int amount){  
		System.out.println("---Another Thread---\nGoing to deposit...");  
		this.amount+=amount;  
		System.out.println("Deposit completed... \n Total Balance is : "+this.amount);  
		notify();
	}
}
public class InterProComm {

	public static void main(String[] args) {
		final Customer c =new Customer();
		System.out.println("Amount is : 10000 ");
		new Thread(){
			public void run(){
				c.withdraw(10000);
			}  
		}.start();
		new Thread(){  
			public void run(){
				c.deposit(15000);
			}  
		}.start();
	}

}
