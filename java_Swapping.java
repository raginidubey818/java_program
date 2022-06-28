package java_practice;
import java.util.Scanner;

public class java_Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
swap();
swapp();
	}
	public static void swap()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,t;
		System.out.println("Enter the number");
		a=sc.nextInt();
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping num1:"+a);
		System.out.println("After swapping num2:"+b);
	}
	public static void swapp()
	{
		int num,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		num=sc.nextInt();
		num3=sc.nextInt();
		num=num+num3;
		num3=num-num3;
		num=num-num3;
		System.out.println("After swapping:"+num);
		System.out.println("After swapping:"+num3);
	}
}


