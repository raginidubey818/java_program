import java.util.Scanner;
 public class Function
	{
	
	   	int num1,num2,sum,res;
		Scanner sc=new Scanner(System.in);
		public static void main(String args[])
	{ 
		Function obj=new Function();
		obj.add();
	}
	public void hello_world()
	{
		System.out.println("This is the hello world block.....:");
	}
	public int add()
	{
		System.out.println("Enter the two number:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		
		System.out.println("Addition of two number is:"+sum);
		return sum;
	}
	public void sqr()
	{
		res=add();
		System.out.println("The square is="+res*res);
	}
	public void evenodd()
	{
		System.out.println("Enter a number:");
		num1=sc.nextInt();
		if(num1%2==0)
	{
		System.out.println("It is even");
	}
	else
	{
		System.out.println("It is odd");
	}
	}
	}