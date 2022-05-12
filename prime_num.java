package primee_demo;
import java.util.Scanner;
public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num,i;
		Scanner sc=new Scanner(System.in);
        boolean flag=false;
          System.out.println("enter the number");
          	num=sc.nextInt();
          	for(i=2;i<=num/2;i++)
          			if(num%i==0)	
          			{
          				flag=true;
          				break;
          			}
	
	if(!flag)
		System.out.println(num+"prime number");
	else
		System.out.println(num+"not a prime number");

}
}
