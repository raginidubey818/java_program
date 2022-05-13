package matrix_demo;

import java.util.Scanner;

public class Matrix_sum 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int p,q,m,n,j,k,l;
		Scanner sc.new Scanner(System.in);
		System.out.println("Enetr number of rows in first matrix:");
		p=sc.nextInt();
		System.out.println("Enter number of columns in first matrix:");
		q=sc.nextInt();
		System.out.println("Enter number of rows in second martrix:");
		m=sc.nextInt();
		System.out.println("Enter number of columns in second matrix:");
		n=sc.nextInt();
		if(p==m && q==n)
		{
				int a[][]=new [p][q];
				int b[][]=new[m][n];
				int c[][]=new[m][n];
				System.out.println("Enter all the elements of first matrix:");
				for(i=0;i<p;i++)
				{
					for(j=0;j<p;j++)
					{
							a[i][j]=sc.nextInt();
					}
				}
				System.out.println("Enter all the element of second matrix:");
				for(i=0;i<p;i++)
				{
					for(j=0;j<q;j++)
					{
						b[i][j]=sc.nextInt();
					}
				}
				System.out.println("First matrix:");
				for(i=0;i<p;i++)
				{
					for(j=0;j<q;j++)
					{
						System.out.println(a[i][j]+" ");
					}
					System.out.println("");
				}
				System.out.println("Second matrix:");
				for(i=0;i<m;i++)
				{
					for(i=0;i<n;i++)
					{
						System.out.println(b[i][j]+" ");
					}
					System.out.println("");
				}
				for(i=0;i<p;i++)
				{
					for(j=0;j<n;j++)
					{
						for(k=0;k<q;k++)
						{
							c[i][j]=a[i][j]+b[i][j];
						}
					}
				}
				System.out.println("Matrix after addition:");
				for(i=0;i<p;i++)
				{
					for(j=0;j<n;j++)
					{
						System.out.println(c[i][j]+" ");
					}
					System.out.println(" ");
				}
		}
		else
		{
			System.out.println("Addition would not be possible:");
		}
	}

}
