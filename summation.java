import java.util.Scanner;
class summation
	{
	public static void main(String args[])
	{
	int num,sum=0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	num=sc.nextInt();
	for(i=1;i<=num;i++)
	{
		sum+=i;
	}
	System.out.println("sum ="+sum);
	}
	}
	