package java_practice;
import java.util.Scanner;

public class java_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	factorial();
		int r=demo();
		System.out.println("the addition is:"+ r*r);
	}
	public static int demo()
	{
		int num1,num2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		 res=num1+num2;
		 return res;
		
	}
	public static void factorial()
	{
		int num,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num>0)
		{
			f=f*num;
			num--;
		}
		System.out.println("The factorial is:"+f);
		}
	}


