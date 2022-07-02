package java_practice;

public class hyb3 extends hyb2 {
	public void palindrom()
	{
		accept();
		int num1=num[0];
		int num2;
		num2=num1;
		while(num1>0)
		{
			r=num1%10;
			sum=sum*10+r;
			num1=num1/10;
		}
		if(num2==sum)
		{
			System.out.println("the number is palindrom");
		}
		else
		{
			System.out.println("The numebr is not a palindrom");
		}
		}
}
