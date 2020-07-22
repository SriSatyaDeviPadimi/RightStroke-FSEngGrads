class StaticMethod{
	static void printString(){
		System.out.println("This is Static Method!");
	}
	static void myStaticMethod(){
		printString();
	}
	public static void main(String args[]){
		myStaticMethod();
	}
}
	