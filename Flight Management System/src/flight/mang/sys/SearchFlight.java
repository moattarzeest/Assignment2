package flight.mang.sys;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class SearchFlight {
	
	Scanner scstrings = new Scanner(System.in);
	public String source;
	public String destination;
	boolean bool=false;
	FlightOptions objfp=new FlightOptions();
	//int i=0;
	//int j=0;
	public void flightSearch() 
	{
		System.out.println("Enter source flight ");
		this.source=scstrings.nextLine();
		try
		{
		File fobj=new File("C:/Users/Zubair/Desktop/flights.txt");
		Scanner read=new Scanner(fobj);
		while(read.hasNextLine())
		{
		String inputString=read.nextLine();
		String[] dataFile =inputString.split(" ");
		String value1=dataFile[1];
		
	
		 if (source.equals(dataFile[1]))
		{ 
			  //   System.out.println("index " +i);
				System.out.println("Enter destination flight ");
				this.destination=scstrings.nextLine();
				if(destination.equals(dataFile[2]))
				{
				   
					System.out.println(" --------------------------------------------------");
					System.out.println(" The information about this flight is as follows");
					System.out.println(" Flight type     | "+dataFile[0]);
					System.out.println(" Available seats | "+dataFile[3]);
					System.out.println(" Arrival Time    | "+dataFile[4]);
					System.out.println(" Arrival Day     | "+dataFile[5]);
					System.out.println(" Flight Fare     | "+dataFile[6]);
					System.out.println(" --------------------------------------------------");
			       
					objfp.menu();
				}
				else
				{
					System.out.println("No flight going to this destination " );
				}
				
				
				
		}	 
		
		}
		
		
		
		
		}
			
		
		
		
		catch(FileNotFoundException error)
		{
			System.out.println("Sorry, an unexpected error occured.");
			//error.printStackTrace();
		}
		
	}

}
