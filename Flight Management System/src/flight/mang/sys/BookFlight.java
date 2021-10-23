package flight.mang.sys;

import java.io.BufferedWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class BookFlight {
	
	SearchFlight objSearchFlight=new SearchFlight();
	FlightCalender objFlightCalender=new FlightCalender();
	Scanner scint=new Scanner(System.in);
	Scanner scstrings=new Scanner(System.in);
	public String source;
	public String destination;
	int availableSeats;
	int index=0;
	FileWriter fw=null;
	//BufferedWriter bw=null;
	PrintWriter pw=null;
	BufferedReader br= null;
	boolean flag=false;
	
	
	void flightbooking() 
	
	{ 
		
		
		System.out.println(" Here is our flight calender ");
		objFlightCalender.printingCalender();
		System.out.println("Enter the flight type you want to choose ");
		String flightType=scstrings.nextLine();
		try
		{
			File fobj=new File("C:/Users/Zubair/Desktop/flights.txt");
			Scanner read=new Scanner(fobj);
			while(read.hasNextLine())
			{
			String inputString=read.nextLine();
			String[] dataFile =inputString.split(" ");
			String value1=dataFile[0];
				if(flightType.equals(dataFile[0]))
				{
					 String oldContent=dataFile[3];
					System.out.println("Enter number of seats you want to book. ");
					int seats= scint.nextInt();
					
					  availableSeats=(Integer.parseInt(dataFile[3])-seats);
					  String avaSeats=String.valueOf(availableSeats);
					String s;
					try
					{
						
					br = new BufferedReader (new FileReader(fobj));
					String line=br.readLine();
					while(line!=null)
					{
						oldContent=oldContent+line+System.lineSeparator();
						line=br.readLine();
					}
					String newContent=oldContent.replaceAll(dataFile[3],avaSeats );
					fw=new FileWriter(fobj);
					fw.write(newContent);
					
					}
					catch (IOException e)
					{
						
					}
					finally
					{
						
						
						 try {
							br.close();
							//pw.close();
							fw.close();
						}
						 catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				
			}
		}
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		/*objSearchFlight.flightSearch();
		
		System.out.println("Enter number of seats you want to book. ");
		int seats= scint.nextInt();
		if(seats>100)
		{
			System.out.println("We are sorry, we do not have suffecient seats. ");
			System.out.println("Please try again later. ");
			flightbooking();
		}
		else
		{
			
		}*/
	/*	System.out.println("Enter source flight ");
		this.source=scstrings.nextLine();
		try
		{
			
		File fobj=new File("C:/Users/Zubair/Desktop/flights.txt");
		Scanner read=new Scanner(fobj);
		while(read.hasNextLine())
		{
		String inputString=read.nextLine();
		String[] dataFile =inputString.split(" ");
		String value1=dataFile[0];
		String value2=dataFile[1];
		String value3=dataFile[2];
		
		
		 if (source.equals(dataFile[0]))
		{ 
			//System.out.println(index);
				System.out.println("Enter destination flight ");
				this.destination=scstrings.nextLine();
				if(destination.equals(dataFile[1]))
				{
				  
					System.out.println("Enter number of seats you want to book. ");
					int seats= scint.nextInt();
					if(seats>100)
					{
						System.out.println("We are sorry, we do not have sufficient seats. ");
						System.out.println("Please try again later. ");
						flightbooking();
					}
					else
					{
					 	  availableSeats=(Integer.parseInt(dataFile[2])-seats);
						  String avaSeats=String.valueOf(availableSeats);
						  String oldContent=dataFile[2];
						//  System.out.println("dddddddddddddddddddd" +oldContent);
						oldContent="";
						try
						{
							
						   	br = new BufferedReader (new FileReader(fobj));
							String line=br.readLine();
						
							while(line!=null)
							{
								oldContent=oldContent+line+System.lineSeparator();
								line=br.readLine();
								if(  (value1.equals(source)) && (value2.equals(destination))  )
								{
									String newContent=oldContent.replaceAll(value3,avaSeats );
									pw=new PrintWriter(fobj);
									pw.write(newContent);
								}
 							   
								
							}
							
							
							
							
							
							
							pw.flush();
							//fw=new FileWriter(fobj);
							//fw.write(newContent);
							//pw.flush();
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						finally
						{
							
							
							 try {
								br.close();
								pw.close();
								//fw.close();
							}
							 catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					
						
						
						
						/*
						fw=new FileWriter("C:/Users/Zubair/Desktop/login.txt", true);
						bw=new BufferedWriter(fw);
						pw=new PrintWriter(bw);
						pw.write();
						pw.write(" ");
					    pw.write();
					    bw.newLine();
					    // fwrite.write(passnum);
					     
					     pw.flush();
					     
					     
					     pw.close();
						 bw.close();
						 fw.close();*/
						
			/*		}
				}
				else
				{
					System.out.println("No flight going to this destination " );
				}
				
				
				
		}
	
		 
		
	}
		index++;
		
}
		catch(FileNotFoundException error)
		{
			System.out.println("Sorry, an unexpected error occured.");
			//error.printStackTrace();
		}
	
	*/
			
		
	}
}
	


