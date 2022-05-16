import java.util.Scanner;
public class Swapping_demo 
{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Swapping_demo obj=new Swapping_demo();
		obj.Swapping_with();
		obj.Swapping_without();
	}
	public void Swapping_with()
	{
		System.out.println("Enter the two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Numbers after swapping:"+num1+""+num2);
		System.out.println();
		
	}
	public void Swapping_without()
	{
		System.out.println("Enter the two number:\n");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Number after swapping:"+num1+""+num2);
		
	}
	

}
