import java.util.Scanner;
class palindrom
	{	
	public static void main(String args[])
	{
	int num1,num2,rev=0,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	num1=sc.nextInt();
	num2=num1;
	while(num1!=0)
	{
		rem=num1%10;
		rev=rev*10+rem;
		num1=num1/10;
	}
	if(num2==rev)
	{
		System.out.println("The number is Palindrom:");	
	}
	else
	{
		System.out.println("The number is not a Palindrom:");
	}
	}
	}