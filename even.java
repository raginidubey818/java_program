import java.util.Scanner;
class even
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num;
	
	System.out.println("enter the number");
	num=sc.nextInt();
	if(num%2==0)
	{
	 	System.out.println("Number is EVEN:");
	}
	else
	{
		System.out.println("Number is ODD:");
	}
	}
	}	