package com.ani;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("***** WELCOM TO Hospital *****");

			Hospital h = new Hospital();
			
			for( ; ; )
			{
				System.out.println();
//				System.out.println("----------------------------------------------");
				
				System.out.println("1. Add Token." + "\n"+
								   "2. Remove Token." + "\n" +
								   "3. Check-up." + "\n"+
								   "4. Bill." + "\n"+
								   "5. Exit.");
				
				switch(sc.nextInt())
				{
					case 1: h.addToken();break;
					case 2: h.removeToken();break;
					case 3: h.checkUp();break;
					case 4: h.bill();break;
					case 5: System.err.println("Application is closed.");
							System.exit(0);		
				}
			}
		}

	}

}
