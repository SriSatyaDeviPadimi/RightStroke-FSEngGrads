class A{
	void sp(int a, int b){
		System.out.println("Sum of two numbers is : "+(a+b));
	}
}
class B extends A{
	void sp(int a, int b){
		System.out.println("Product of two numbers is : "+(a*b));
	}
}
class OverrideDemo{
	public static void main(String args[]){
		A a=new A();
		B b=new B();
		a.sp(10,20);
		b.sp(10,20);
	}
}	