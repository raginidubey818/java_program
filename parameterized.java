package java_practice;
import java.util.Scanner;

public class parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parameterized();
	}
	public static void parameterized()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		sub(num1,num2);
		mul(num1,num2);
		div(num1,num2);
		mod(num1,num2);
		
		
		
	}
	public static void add(int num1,int num2)
	{
		int res;
		res=num1+num2;
		System.out.println("The addition is:"+res);
		
	}
	
	public static void sub(int num1,int num2)
	{
		int res;
		res=num1-num2;
		System.out.println("The subtraction is:"+res);
	}

	public static void mul(int num1,int num2)
	{
		int res;
		res=num1*num2;
		System.out.println("The multiplication is:"+res);
	}
	
	public static void div(int num1,int num2)
	{
		int res;
		res=num1/num2;
		System.out.println("The division is:"+res);
	}
	
	public static void mod(int num1,int num2)
	{
		int res;
		res=num1%num2;
		System.out.println("The modulus is:"+res);
	}

}
