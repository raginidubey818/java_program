import java.util.Scanner;
class display_square
	{
	public static void main(String args[])
	{
	int num,res;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number");
	num=sc.nextInt();
	if(num%2==0)
	{
	        System.out.println("Number is Even");
		res=num*num;
		System.out.println("Square is:"+res);
	}
	else
	{
	        System.out.println("Number is Odd");
	}
	}
	}
	