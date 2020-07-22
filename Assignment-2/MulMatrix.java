import java.util.Scanner;
class MulMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m,n,i,j,a,b,k,sum=0;
		System.out.print("Enter the number of rows of a first matrix : ");
		m=sc.nextInt();
		System.out.print("Enter the number of columns of a first matrix : ");
		n=sc.nextInt();
		int first[][] = new int[m][n];
		System.out.print("Enter the elements of first matrix : ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				first[i][j]=sc.nextInt();
		System.out.print("Enter the number of rows of a second matrix : ");
		a=sc.nextInt();
		System.out.print("Enter the number of columns of a second matrix : ");
		b=sc.nextInt();
		if(n!=a)
			System.out.println("The matrices can't be multiplied.");
		else{
			int second[][] = new int[a][b];
			int multiply[][]=new int[m][b];
			System.out.print("Enter the elements of second matrix : ");
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
					second[i][j]=sc.nextInt();
			for(i=0;i<m;i++){
				for(j=0;j<b;j++){
					for(k=0;k<a;k++)
						sum=sum+first[i][k]*second[k][j];
					multiply[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("Product of given matrices is : ");
			for(i=0;i<m;i++){
				for(j=0;j<b;j++)
					System.out.print(multiply[i][j]+"\t");
				System.out.print("\n");
			}
		}
	}
}