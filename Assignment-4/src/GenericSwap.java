public class GenericSwap {
	static <T> void swap(T first, T second) {
		System.out.println(" Before  Swapping ");
		System.out.println(first);
		System.out.println(second);
		T temp = first;
		first=second;
		second=temp;
		System.out.println("After Swapping ");
		System.out.println(first);
		System.out.println(second);
	}
	public static void main(String[] args) {
		swap(10,20);
		swap("Satya","Sri");
	}

}
