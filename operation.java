import java.util.Scanner;
class operation
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2,res,arithmetic;
	
	System.out.println("enter the two number");
	num1=sc.nextInt();
	num2=sc.nextInt();
	System.out.println("the arithmetic process:");
	arithmetic=sc.nextInt();
	switch(arithmetic)
	{	
	case 1:
		System.out.println("you selected the Addition");
		res=num1+num2;
		System.out.println("The addition is:"+res);
	break;
	case 2:
		System.out.println("you selected the Subtraction");
		res=num1-num2;
		System.out.println("the subtraction is:"+res);
	break;
	case 3:
		System.out.println("you selected the Multiplication");
		res=num1*num2;
		System.out.println("the multiplication is:"+res);
	break;
	case 4:
		System.out.println("you selected the Division");
		res=num1/num2;
		System.out.println("the division is:"+res);
	break;
	case 5:
		System.out.println("you selected the Modulus");
		res=num1%num2;
		System.out.println("the modulus is:"+res);
	break;
	default:
			System.out.println("wrong choice");
	}
	}
	}