package flight.mang.sys;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException; 
import java.io.PrintWriter;
import java.io.BufferedWriter;
public class Signup {
	
	public
	Scanner scstrings = new Scanner(System.in);
	Scanner scint=new Scanner(System.in);
	public String FullName;
	public String passnum;
	public String pin;
	public String gender;
	public int index=0;
	BookFlight objBookFlight= new BookFlight();
	void credentials()
	{
		System.out.println("Enter your name: ");
		this.FullName = scstrings.nextLine();
		System.out.println("Enter your gender: ");
		this.gender=scstrings.nextLine();
		System.out.println("Enter 5 digits passport number: ");
		this.passnum=scstrings.nextLine();
		System.out.println("Enter 4 digits pin number: ");
		this.pin=scstrings.nextLine();
		System.out.println("You have successfully created your account. ");
				
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try
		{	
			fw=new FileWriter("C:/Users/Zubair/Desktop/login.txt", true);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			
			//FileWriter fwrite=new FileWriter("C:/Users/Zubair/Desktop/login.txt");
			pw .write(passnum);
			pw.write(" ");
		    pw.write(pin);
		    bw.newLine();
		    // fwrite.write(passnum);
		     
		     pw.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pw.close();
				bw.close();
				fw.close();
			}
			catch (IOException error)
			{
				
			}
			
		}
		
		
		System.out.println("Press 0 if you want to proceed to login. ");
		int proceed=scint.nextInt();
		if(proceed==0)
		{
			login();
		}
		else
		{
			
		}

		
	}
	
	void login() 
	{
		System.out.println("Welcome to your account");
		System.out.println("Enter your 5 digits passport number. ");
		this.passnum=scstrings.nextLine();
		
		try
		{
		File fobj=new File("C:/Users/Zubair/Desktop/login.txt");
		Scanner read=new Scanner(fobj);
		while(read.hasNextLine())
		{
			String inputString=read.nextLine();
			String[] passport=inputString.split(" ");
			String value1=passport[0];
			
			if(passnum.equals(passport[0]))
			{
				System.out.println("Enter your 4 digits pin number");
				this.pin=scstrings.nextLine();
				if(pin.equals(passport[1]))
				{
					System.out.println("You have successfuly logged in to your account");
					objBookFlight.flightbooking();
					
					
				}
				else
				{
					System.out.println("Wrong passport number or pin number");
				}
			}
			/*else
			{
				
					
				System.out.println("wrong passport number.Please try again. ");
				if(index<5)
				{
				login();
				}
				else
				{
					System.out.println("You have logged in wrong 5 times. Please try again later. ");
				}
				
				index++;
			}*/
		}
		}
		
		catch(FileNotFoundException error)
		{
			System.out.println("Sorry, an unexpected error occured.");
			//error.printStackTrace();
		}
		
		
	}
	

}
