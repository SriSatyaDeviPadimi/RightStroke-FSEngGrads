import java.util.Scanner;
interface Shape{
	public void calculateArea();
}
class Square implements Shape{
	
	public void calculateArea(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter s value : ");
		int s=sc.nextInt();
		System.out.println("Area of Square is : "+(s*s));
	}
}
class Circle implements Shape{
	public void calculateArea(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of radius : ");
		int r=sc.nextInt();
		System.out.println("Area of Circle is : "+(3.14f*r*r));
	}
}
class Rectangle implements Shape{
	public void calculateArea(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of Rectangle : ");
		int l=sc.nextInt();
		System.out.print("Enter height of Rectangle : ");
		int h=sc.nextInt();
		System.out.println("Area of Rectangle is : "+(l*h));
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		Square s = new Square();
		Circle c = new Circle();
		Rectangle re = new Rectangle();
		s.calculateArea();
		c.calculateArea();
		re.calculateArea();
	}
}

			