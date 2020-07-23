package pack2;
import pack1.A;
public class B{
	public static void main(String args[]){
		A a = new A();
		a.display();
		System.out.println("Above statement is from package p1.\n I am from package p2");
	}
}	