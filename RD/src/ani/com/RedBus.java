package ani.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedBus 
{
	List acl = new ArrayList();
	
	Account a = new Account();
	Ticket t = new Ticket();
	
	Scanner sc = new Scanner(System.in);

	public void signUp()
	{
			System.out.print("Enter Name: ");
			String a = sc.next();
			System.out.print("Creat user id : ");
			String b = sc.next();
			System.out.print("Creat password : ");
			int c = sc.nextInt();
			System.out.print("Enter mobile no : ");
			long d = sc.nextLong();
		
			Account ac = new Account(a,b,c,d);	
		
					acl.add(ac);
					System.out.println("Account created successfully.");
					return;
						
	}
	public void login()
	{
		if(acl.size()!=0)
		{
			System.out.print("Enter user id  : ");
			String usid  = sc.next();
		
			System.out.print("Enter password : ");
			int ps = sc.nextInt();
		
			for(int i = 0;i<acl.size();i++)
			{
				Object ob =acl.get(i);
				Account a1 = (Account)ob;
				
				if((a1.uid.equalsIgnoreCase(usid)) && (a1.pass==ps))
				{
					System.out.println("Login Successfully.");
					ticket(ob);
					return;
				}
			}
			System.err.println("incorrect user id and Password.");
		}
		else
		{
			System.err.println("First creat a account");
		}
	}	
	public void ticket(Object a)
	{
		Ticket t = new Ticket();
	
		for(;;)
		{
			System.out.println();

			System.out.println("1. Profile Details." + "\n"+
							   "2. Book Ticket." + "\n"+
							   "3. Cancel Ticket." + "\n" +
							   "4. Change Date" + "\n" +
							   "5. Show Ticket. "+ "\n" +
							   "6. Logout.");
			
			switch(sc.nextInt())
			{
				case 1:
				{
					if(acl.isEmpty())
						System.err.println("First Create account");
					else
						System.out.println(a);
				}
				break;
				case 2:
				{
					if(acl.isEmpty())
						System.err.println("First book ticket");
					else
					t.bookTicket();
				}
				break;
				case 3:
				{
					if(t.tl.isEmpty())
						System.err.println("First book ticket");
					else
					t.cancelTicket();
				}
				break;
				case 4:
				{
					if(t.tl.isEmpty())
						System.err.println("First book ticket");
					else
					t.changeDate();
				}
				break;
				case 5:
					{
						if(t.tl.isEmpty())
							System.err.println("First book ticket");
						else
						System.out.println(t.tl);
					}
					break;
					
				case 6: System.err.println("logout successfully.");return;		
			}
		}
	}
	
}
