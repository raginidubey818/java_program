package armstrong_demo;
import java.util.Scanner;

public class arm_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,number,temp,total=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		num=sc.nextInt();
		
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number/=10;
		}
		if(total==num)
			System.out.println(num+"is armstrong");
		else
			System.out.println(num+"not a armstrong");
	}
}
