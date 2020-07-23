import java.util.Scanner;
class Publication{
	String title;
	int price;
	Publication(String title){
		this(title,100);
	}
	Publication(String title, int price){
		this.title=title;
		this.price=price;
	}
	void display(){
		System.out.println("Title : "+title);
		System.out.println("Price : Rs."+price);
	}
}
class Book extends Publication{
	int pages;
	Book(String title,int pages){
		super(title);
		this.pages=pages;
	}
	void display(){
		super.display();
		System.out.println("Pages : "+pages);
	}
}
class CD extends Publication{
	int size;
	CD(String title,int size){
		super(title);
		this.size=size;
	}
	void display(){
		super.display();
		System.out.println("size : "+size+"cm");
	}
}
class PublicationBook{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the book : ");
		String s=sc.nextLine();
		System.out.print("Enter the price of the book : ");
		int pr = sc.nextInt();
		System.out.print("Enter how many pages in the book : ");
		int pa = sc.nextInt();
		Publication p;
		p= new Book(s,pa);
		p.display();
		System.out.print("Enter the size of the book : ");
		int si=sc.nextInt();
		p=new CD(s,si);
		p.display();
	}
}
		