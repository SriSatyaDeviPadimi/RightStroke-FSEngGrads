import java.util.Scanner;
class AreaOfRectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of a rectangle : ");
        int len = sc.nextInt();
        System.out.print("Enter height of a rectangle : ");
        int heig = sc.nextInt();
        System.out.print("Area of a rectangle is : "+(len*heig));
    }
}