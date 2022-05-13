import java.util.Scanner;
class prime_num
	{
	public static void main(String args[])
	{
	int num=0,i=0,n,counter;
	Scanner sc=new Scanner(System.in);
	String primeNumber="";
	System.out.println("Enter the value of n:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	    counter=0;
		for(num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				counter=counter+1;
			}
		}
		if(counter==2)
		{
			primeNumber=primeNumber+i+" ";
		}
	}
	System.out.println("prime number from 1 to n:");
	System.out.println(primeNumber);
	}
	}