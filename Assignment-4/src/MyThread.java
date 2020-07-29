
public class MyThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread{
	public void run(){
		try {
			System.out.print("Thread 1 Started \n");
			for(int i=8;i>0;i--) {
				Thread.sleep(500);
				System.out.println("T1 : "+i);
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread 1 Completed");
		}
	}
}
class Thread2 extends Thread{
	public void run(){
		try {
			System.out.println("Thread 2 Started ");
			for(int i=1;i<5;i++) {
				Thread.sleep(500);
				System.out.println("T2 : "+i);
			}
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread 2 Completed");
		}
	}
}