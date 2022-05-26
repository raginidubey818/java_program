import java.util.Scanner;
class dime
	{
	public static void main(String args[])
	{
	int[][] twodim={{10,20,30},{40,50,60}};
	System.out.println("Original array:/n");
	print_array(twodim);
	System.out.println("After changing the rows and columns:");
	transpose(twodim);
	}
	private static void transpose(int[][]twodim)
	{
	int[][] newtwodim=new int[twodim[0].length][twodim.length];
	for(int i=0;i<twodim.length;i++)
	{
		for(int j=0;j<twodim[0].length;j++)
		{
			newtwodim[i][j]=twodim[i][j];
		}
	}
	print_array(newtwodim);
	}
	private static void print_array(int[][] twodim)
	{
		for(int i=0;i<twodim.length;i++)
		{
			for( int j=0;j<twodim[0].length;j++)
			{
			System.out.println(twodim[i][j]+ " ");
			}
			System.out.println();
	}
	}
	}
	
	