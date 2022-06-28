package java_practice;
import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		/*int num1,num2,num3,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		greater(num1,num2,num3);
		factorial(num1,fact);
		reverse(num1);*/
	}
		public static void greater(int num1,int num2,int num3)
		{
		if(num1>num2)
		{
			System.out.println("The first number is greater"+num1);
		}
		else if(num2>num3)
		{
			System.out.println("The second number is greater"+num2);
		}
		else
		{
			System.out.println("The third number is greater"+num3);
		}
	}
	
 public static void factorial(int num1,int fact)
 {
	 while(num1>0)
	 {
		 fact=fact*num1;
		 num1--;
	 }
	 System.out.println("The factorial is:"+fact);
	 }
	 public static void reverse(int num1)
	 {
		 int rem,rev=0;
		 while(num1!=0)
		 {
			rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		 }
		 System.out.println("The reverse of the number is"+rev);
	 }
	 
 }