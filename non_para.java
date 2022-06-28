package java_practice;
import java.util.Scanner;
public class non_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
non_para obj=new non_para();
obj.accept();

}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the number");
		num1=sc.nextInt();
		num2=sc.nextInt();
		add(num1,num2);
		sub(num1,num2);
		mul(num1,num2);
		div(num1,num2);
		mod(num1,num2);
		
	}
	public void add(int num1,int num2)
{
		int res;
		res=num1+num2;
		System.out.println("The addition is:"+res);
}
	public void sub(int num1,int num2)
	{
	int res;
	res=num1-num2;
	System.out.println("The subtraction is:"+res);
}
	public void mul(int num1,int num2)
	{
		int res;
		res=num1*num2;
		System.out.println("The multiplication is:"+res);
	}
public void div(int num1,int num2)
{
	int res;
	res=num1/num2;
	System.out.println("The division is:"+res);
	
}
public void mod(int num1,int num2)
{
	int res;
	res=num1%num2;
	System.out.println("The modulus is:"+res);
	}




}
