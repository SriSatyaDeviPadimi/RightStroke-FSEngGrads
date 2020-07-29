import java.util.*;
public class GenericStack <T> {
	private ArrayList<T> stack = new ArrayList<T>();
	private int top=0;
	public int size() {
		return top;
	}
	public void push(T item) {
		stack.add(top++,item);
	}
	public T pop() {
		return stack.remove(--top);
	}
	public static void main(String args[]) {
		GenericStack<Integer> s =new GenericStack<Integer>();
		GenericStack<String> st =new GenericStack<String>();
		s.push(17);
		st.push("Satya");
		s.push(33);
		s.push(3);
		int i =s.pop();
		String str=st.pop();
		System.out.format("Popped from stack is : %d",i);
		System.out.format("\nPopped from stack is : "+str);;
	}
}
