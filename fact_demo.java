package factorial_demo;
import java.util.Scanner;
public class fact_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,fact=1;
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         num=sc.nextInt();
         
         for(i=1;i<=num;i++)
         {
        	 fact=fact*i;
        	 System.out.println(fact);
         }
	}

}
