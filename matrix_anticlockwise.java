import java.util.Scanner;
public class matrix_anticlockwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int[][] a2=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a2[i][j]=a[j][i];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a2[i][j] +" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(a2[i][j] +" ");
			}
			System.out.println();
		}
		
		

	}

}
