public class AutoUnBox {
	static int add(Integer a, Integer b) {//autoboxing in parameters
		return a+b;//unboxing in return
	}
	public static void main(String args[]) {
		int sum=add(10,22);
		System.out.println("Sum = "+sum);
	}
}
