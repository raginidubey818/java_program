package java_practice;
import java.util.Scanner;

public class hyb1 
{
int size,i,r,sum=0,temp=0;
int[]num;
double avg;
Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		num=new int[size];
		System.out.println("enter numbers"+size);
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}

	}

}
