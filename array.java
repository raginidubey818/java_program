import java.util.Scanner;

public class array
	 {

	public static void main(String[] args) 
		{
		
		
		int[] arr=new int[10];
		int arr1[];
		arr1=new int[78];
		
		int arr2[]= {56,34,78,12,78,34,56,78};
		
		System.out.println("The array is = "+arr2[0]);
		System.out.println("The array is = "+arr2[1]);
		System.out.println("The array is = "+arr2[2]);
		System.out.println("The array is = "+arr2[3]);
		arr2[4]=90;
		System.out.println("The array is = "+arr2[4]);
		System.out.println("The array is = "+arr2[5]);
		System.out.println("The array is = "+arr2[6]);
		System.out.println("The array is = "+arr2[7]);
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter 10 Numbers");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println("Numbers:"+arr[i]);
		}
		

	}

}
