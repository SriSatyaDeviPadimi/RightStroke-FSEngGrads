import java.util.Scanner;
class AddMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m,n,i,j;
		System.out.print("Enter the number of rows of a matrix : ");
		m=sc.nextInt();
		System.out.print("Enter the number of columns of a matrix : ");
		n=sc.nextInt();
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		System.out.print("Enter the elements of first matrix : ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				first[i][j]=sc.nextInt();
		System.out.print("Enter the elements of second matrix : ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				second[i][j]=sc.nextInt();
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				sum[i][j]=first[i][j]+second[i][j];
		System.out.println("Sum of given matrices is : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++)
				System.out.print(sum[i][j]+"\t");
			System.out.println();
		}
	}
}