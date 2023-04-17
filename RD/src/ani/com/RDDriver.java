package ani.com;

import java.util.Scanner;

public class RDDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		RedBus rd  = new RedBus();
		Account ac= new Account();
		
		System.out.println("***** WELCOM TO REDBUS APPLICATION *****");
		
		
		
			for( ; ; )
			{
				System.out.println();
				System.out.println("1. Sign up." + "\n"+
								   "2. Login" + "\n" +
								   "3. Exit.");
				try {
				switch(sc.nextInt())
				{
					case 1: rd.signUp();break;
					case 2: rd.login();break;
					case 3: System.err.println("Application is closed.");
							System.exit(0);		
				}
				
				}
				catch(Throwable a)
				{
					System.err.println("Only number are required for password & mobile no.");
					
				}
			}

		
			
	}
}
