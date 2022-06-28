package java_practice;
import java.util.Scanner;

public class java_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num,rem,sum=0,num1;
System.out.println("Enter the number");
num=sc.nextInt();
num1=num;
while(num>0)
{
	rem=num%10;
	sum=sum*10+rem;
	num=num/10;
}
if(num1==sum)
{
	System.out.println("the number is palindrom");
}
else
{
	System.out.println("the number is not a palindrom");
}
	}

}
