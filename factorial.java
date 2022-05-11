import java.util.Scanner;
class factorial
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num,fact=1,i;
	System.out.println("Enter the number");
	num=sc.nextInt();
	
	i=1;
	while(i<=num)
	{
	fact=fact*i;
	System.out.println(fact);
	i++;
	}
	}	
	}