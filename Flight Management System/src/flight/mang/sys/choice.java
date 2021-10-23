package flight.mang.sys;

import java.util.Scanner;

class choice
{
	public static
	Scanner scint = new Scanner(System.in);
	
	
	
	static void options()
	{
		Signup obj=new Signup();
		System.out.println("===WELCOME TO FLIGHT MANAGMENT SYSTEM===");
		System.out.println("Choose one of the three options from menu ");
		System.out.println("1. Signup for a new account ");
		System.out.println("2. Login to your account ");
		System.out.println("3. Exit ");
		int optionChoice=scint.nextInt();
		
		if(optionChoice==1)
		{
			obj.credentials();
		}
		else if(optionChoice==2)
		{
			
		}
		else if (optionChoice==3)
		{
			
		}
		else
		{
			System.out.println("Invalid selection");
		}
	}
	
	
	
}
