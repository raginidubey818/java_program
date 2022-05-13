package integer_demo;

import java.util.Scanner;

public class Int_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter,i=0,num=0,sumodd=0;sumeven=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		System.out.println("The number you entered are:");
		for(i=num;i!=0;i=i)
		{
			if(i%2==0)
				sumeven=sumeven+i;
			else
				sumodd=sumodd+i;
			i=sc.nextInt();
		}
		System.out.println("Even sum:"+sumeven);
		System.out.println("Odd sum:"+sumodd);

	}

}
