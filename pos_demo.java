package positive_demo;
import java.util.Scanner;
public class pos_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,negative=0,positive=0,zero=0,size;
          Scanner sc=new Scanner(System.in);
          System.out.println("How many nubmers you want to enter");
          size=sc.nextInt();
          int[] arr=new int[size];
          System.out.println("Enter the number");
          for(i=0;i<size;i++)
          {
        	  arr[i]=sc.nextInt();
        	  if(arr[i]>0)
        	  {
        		  positive=positive+1;
        	  }
        	  else if(arr[i]<0)
        	  {
        		  negative=negative+1;
        	  }
        	  else
        	  {
        		  zero=zero+1;
        	  }
        	  System.out.println("Total positive numbers:"+positive);
        	  System.out.println("Total negative numbers:"+negative);
        	  System.out.println("Total zero numbers:"+zero);
          }
	}

}
