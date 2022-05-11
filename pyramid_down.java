package pattern;

public class pyramid_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,i,j,k;
		for(i= 0; i<= rows-1; i++)  
		{  
		       for(j=0; j<=i; j++)  
		{  
		         System.out.print(" ");  
		}  
		            for(k=0; k<=rows-1-i; k++)  
		        {  
		           System.out.print("*" + " ");  
		        }  
		     System.out.println();  
	    	}  
		}  
		}  
	


