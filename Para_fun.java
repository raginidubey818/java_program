package java_demo;
import java.util.Scanner;
public class Para_fun 
{
	
	int res;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Para_fun obj=new Para_fun();
		obj.accept();

	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		sub(num1,num2);
		mul(num1,num2);
		div(num1,num2);
		mod(num1,num2);
	}
	public void add(int a,int b)
	{
		res=a+b;
		System.out.println("The add is ="+res);
	}
	public void sub(int a,int b)
	{
		res=a-b;
		System.out.println("The sub is="+res);
	}
	public void mul(int a,int b)
	{
		res=a*b;
		System.out.println("The mul is="+res);
	}
	public void div(int a,int b)
	{
		res=a/b;
		System.out.println("The div is="+res);
	}
	public void mod(int a,int b)
	{
		res=a%b;
		System.out.println("The mod is="+res);
	}
}
