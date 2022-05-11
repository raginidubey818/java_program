package pattern;

public class pattern_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int n=5,i,j;
             for(i=1;i<=n;i++)
             {
            	 	for(j=i;j<=n;j++)
            	 	{
            	 			System.out.println(" ");
            	 	}
            	 		for(j=1;j<=i;j++)
            	 		{
            	 				System.out.println(" * ");
            	 		}
            	 		System.out.println(  );
             }
	}

}
