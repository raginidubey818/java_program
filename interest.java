import java.util.Scanner;
class interest
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int age;
	char gender;
	System.out.println("Enter the gender:");
	gender=sc.next().charAt(0);
	System.out.println("Enter the age:");
	age=sc.nextInt();
	System.out.println(gender);

	if(gender=='m' && age<60)
	{
	    System.out.println("The RI is 7%");
	}
	if(gender=='f' && age<60)
	{
	    System.out.println("The RI is 7.5%");
	}
	if(gender=='m' && age>60);
	{
	    System.out.println("The RI is 5%");
	}
	else
	}
	}
	