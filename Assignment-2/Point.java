import java.util.Scanner;
class Point{
	int x,y;
	Point (){
		System.out.println("---Default Constructor---");
		x=33;
		y=99;
		System.out.println(x+" - "+y+" = "+(x-y));
	}
	Point(int a,int b){
		x=a;
		y=b;
		System.out.println("---Parameterizied Constructor---");
		System.out.println(x+" - "+y+" = "+(x-y));
	}
	Point(double a,double b){
		System.out.println("---Constructor Overloading---");
		System.out.println("a+b="+(a+b));
	}
	void display(){
		System.out.println("This is display Method!!");
	}
	public static void main(String args[]){
		Point p = new Point();
		Point p1= new Point(3,5);
		Point p2= new Point(12.5,23.6);
		p.display();
	}
}