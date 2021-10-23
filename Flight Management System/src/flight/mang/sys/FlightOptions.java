package flight.mang.sys;

import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files


public class FlightOptions {

	public static
	Scanner scint = new Scanner(System.in);
	
	static void menu() 
	{
		FlightCalender objFlightCalender=new FlightCalender();
		SearchFlight objSearchFlight=new SearchFlight();
		Signup objSignup=new Signup();
		System.out.println("  ---------------------------------------------");
		System.out.println("  | WELCOME TO FLIGHT MANAGMENT SYSTEM        |");
		System.out.println("  | Choose one of the three options from menu |");
		System.out.println("  | 1. View Flight Calender                   |");
		System.out.println("  | 2. Book A Flight                          |");
		System.out.println("  | 3. Search A Flight                        |");
		System.out.println("  ---------------------------------------------");
		int optionChoice=scint.nextInt();
		
		if(optionChoice==1)
		{
			objFlightCalender.printingCalender();
		}
		else if(optionChoice==2)
		{
			System.out.println("Press 1 for signing up for a new account ");
			System.out.println("Press 0 to login to your account " );
			int c=scint.nextInt();
			if(c==1)
			{
				objSignup.credentials();
			}
			else if(c==0)
			{
				objSignup.login();
			}
			else
			{
				System.out.println("You entered a wrong choice");
				
			}
			
		}
		else if (optionChoice==3)
		{
			objSearchFlight.flightSearch();
		}
		else
		{
			System.out.println("Invalid selection");
		}
		
		
		
	  }
	
	   public static void main(String args[])  {
	    menu();
		
		}
}
