// Dylan Franklin

public class IntVersusDouble

{

	public static void main(String[] args) 
	
	{
	
	double doubFeet = 1.0;
	int intFeet = 1;
		  
		// Double Run
	
		{

		  long startTime = System.currentTimeMillis();
		  
		  for (int i = 0; i < 1000000000; i++);
		    doubFeet = doubFeet * 2;
		
		  long endTime = System.currentTimeMillis();
		     
		  System.out.println("Time for 1,000,000,000 multiplications (double): " + (endTime - startTime) + " milliseconds");
		  
		}
		
		// Integer Run
		
		{
			  
		   long startTime = System.currentTimeMillis();
			  
		   for (int i = 0; i < 1000000000; i++);
			    intFeet = intFeet * 2;
			
		   long endTime = System.currentTimeMillis();
			   
			  
		   System.out.println("Time for 1,000,000,000 multiplications (int): " + (endTime - startTime) + " milliseconds");
			  
		}
	}

}