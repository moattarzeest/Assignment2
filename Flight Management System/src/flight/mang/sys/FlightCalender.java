package flight.mang.sys;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FlightCalender {
	
	public void printingCalender()
		
	{
		boolean flag=true;
		FlightOptions objfp=new FlightOptions();
		try
		{
			File fobj=new File("C:/Users/Zubair/Desktop/flights.txt");
			Scanner read=new Scanner(fobj);
			System.out.println("         FLIGHT CALENDER           ");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Flight type | Source | Destination | Seats | Hours | Day | Fare ");
			System.out.println("----------------------------------------------------------------");
			while(read.hasNextLine())
			{
				String data=read.nextLine();
				System.out.println(data);
				
			}
			System.out.println("----------------------------------------------------------------");
			read.close();
			
		}
		catch(FileNotFoundException error)
		{
			System.out.println("Sorry, an unexpected error occured.");
			//error.printStackTrace();
		}
	}
	

}

