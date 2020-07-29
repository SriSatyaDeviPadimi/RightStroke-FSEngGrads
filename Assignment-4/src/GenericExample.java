class Gen<T>{//generic class
	T ob;
	Gen(T o){//generic constructor
		ob=o;
	}
	public T getOb() {
		return ob;
	}
}
public class GenericExample {
public static <E> void printArray(E[] inputArray) {//generic block
	for(E element:inputArray) {
		System.out.print(element+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		Gen <Integer> iob = new Gen<>(100);
		int x=iob.getOb();
		System.out.println(x);
		Gen <String> sob = new Gen<>("Hellooo");
		String s=sob.getOb();
		System.out.println(s);
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray= {5.8,4.5,2.3,3.3,8.6};
		Character[] charArray = {'S','A','T','Y','A'};
		System.out.print("Array integer contains : ");printArray(intArray);
		System.out.print("Array integer contains : ");printArray(doubleArray);
		System.out.print("Array integer contains : ");printArray(charArray);		
	}
}
