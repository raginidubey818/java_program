import java.io.*;
class secondlargest
	{	
	public static void main(String args[])
	{
	int temp,size,i,j;
	int array[]={10,20,50,25,12,66,89};
	size=array.length;
		
	for(i=0;i<size;i++)	
	{
		for(j=i+1;j<size;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
		System.out.println("The second largest number is:"+array[size-2]);
	}
	}