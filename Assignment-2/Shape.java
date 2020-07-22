import java.util.Scanner;
class Shape{
	void area(double l,double h){
		System.out.print("Area of rectangle is : "+(l*h));
	}
	void area(double a){
		System.out.print("Area of square is : "+(a*a));
	}
	public static void main(String args[]){
		Shape mo = new Shape();
		Scanner sc =new Scanner(System.in);
		System.out.println("-----Demostration of Overloading-----");
		System.out.print("Enter number of inputs (1/2) : ");
		int n = sc.nextInt();
		if(n==2){
			System.out.print("Enter length of rectangle : ");
			double l = sc.nextDouble();
			System.out.print("Enter height of rectangle : ");
			double h = sc.nextDouble();
			mo.area(l,h);
		}
		else{
			System.out.print("Enter a value : ");
			double s = sc.nextDouble();
			mo.area(s);
		}
	}
}