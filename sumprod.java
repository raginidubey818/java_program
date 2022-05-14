import java.util.Scanner;
class sumprod
	{
	public static void main(String args[])
	{
	int num,a[],sum=0,prod=1,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of array element:");
	num=sc.nextInt();
	a=new int[num];
	System.out.println("Enter the array elements:");
	for(i=0;i<num;i++)
	{
		System.out.println("enter the "+(i+1)+" element:");
		a[i]=sc.nextInt();
	}
	for(i=0;i<num;i++)
	{
		sum=sum+a[i];
		prod=prod*a[i];
	}
	System.out.println("Sum of array element is:"+sum);
	System.out.println("product of array element is:"+prod);
	}
	}
	