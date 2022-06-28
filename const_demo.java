package java_practice;

import java.util.Scanner;

public class const_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		const_demo obj=new const_demo();
		obj.Switch();
	}
	
		public void Switch()
		{
			function obj1=new function();
			Scanner sc=new Scanner(System.in);
			System.out.println("press 1 for greater,2 for factorial,3 for reverse ");
			int choice;
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				int num1,num2,num3;
				System.out.println("Enter the three numbers");
				num1=sc.nextInt();
				num2=sc.nextInt();
				num3=sc.nextInt();
				obj1.greater(num1,num2,num3);
				break;
			case 2:
				System.out.println("Enter the number");
				int n=sc.nextInt();
				int fact=1;
				 while(n>0)
				 {
					 fact=fact*n;
					 n--;
				 }
				 System.out.println("The factorial is:"+fact);
				 break;
			case 3:
				System.out.println("Enter the number");
				int n1=sc.nextInt();
				int rem,rev=0;
				 while(n1!=0)
				 {
					rem=n1%10;
					rev=rev*10+rem;
					n1=n1/10;
				 }
				 System.out.println("The reverse of the number is"+rev);
				 break;
				 default:
					 System.out.println("wrong choice");
			}
		}
		
	

}
