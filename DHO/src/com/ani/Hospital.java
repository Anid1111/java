package com.ani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital 
{
	List al = new ArrayList();
	List l = new ArrayList();
	
	Doctor d = new Doctor();

	Scanner sc = new Scanner(System.in);

	public void addToken()
	{         
		int tno = al.size()+1;
		System.out.println("Your Token Number : " + tno);
		System.out.println("Enter Name : ");
		String pname = sc.next();
		System.out.println("Enter Contact Number : ");
		long mobno = sc.nextLong();																																
		
		System.out.println("Enter Address(city) : ");
		String add = sc.next();
	
		Patient p = new Patient(tno,pname,mobno,add);
		al.add(p);
		System.out.println();
		System.out.println("Patient added.");
	}
	public void removeToken()
	{
		if(al.size() == 0)
		{
			System.err.println("First add Tokens.");
			return;
		}
		else
		{
			System.out.println("Enter Token number: ");
			int tno = sc.nextInt();
			
			for(int i = 0;i<al.size();i++)
			{
				Patient p = (Patient)al.get(i);
				if(p.tno == tno)
				{
					System.out.println("Token removed.");
					al.remove(p);
					
					for(int j = i;j<al.size();j++)
					{
						Patient p1 = (Patient)al.get(j);
						p1.tno=p.tno++;
					}
					return;
				}
			}
			System.err.println("Token number not available.");
		}				
	}
	public void checkUp()
	{
		
			System.out.println("Enter the Doctor's Name : ");
			String name = sc.next();
			
			System.out.println("Enter the Password : ");
			String pass = sc.next();
		
			if(name.equalsIgnoreCase(d.dname1) && (pass.equals(d.dpass1))) 
			{
				System.out.println("Login Succesfully.");	
				
				for(;;)
				{
					System.out.println("1.Display Patient List.");
					System.out.println("2.Check Patients");
					System.out.println("3.Logout");
					int i = sc.nextInt();
					switch(i)
					{
						case 1 : 
						{ 
							if(al.size() == 0)
							{
								System.err.println("First add Tokens.");
								break;
							}
							else
							System.out.println(al);break;						
						}
						case 2 : jDoct();break;
						case 3 : System.err.println("Logout Succesfully."); return;
					}
				}
			}
			else if (name.equalsIgnoreCase(d.dname2) && (pass.equals(d.dpass2)))	
			{
				System.out.println("Login Succesfully.");	
				
				for(;;)
				{
					System.out.println("1.Display Patient List.");
					System.out.println("2.Check Patients");
					System.out.println("3.Logout");
					int i = sc.nextInt();
					switch(i)
					{
						case 1 : 
						{ 
							if(l.size() == 0)
							{
								System.err.println("Patients not found");
								break;
							}
							else
							System.out.println(al);break;						
						}
						case 2 : sDoct();break;
						case 3 : System.err.println("Logout Succesfully."); return;
					}
				}
			}
			else
			{
				System.err.println("Incorrect name and password.");	
				return;
			}
	}
	public void jDoct()
	{
		if(al.size() == 0)
		{
			System.err.println("Patients not found.");
		}
		else
		{
			System.out.println("Enter Token number");
			int tno1 = sc.nextInt();

			for(int i = 0;i<al.size();i++)
			{
				Patient p = (Patient)al.get(i);
				if(p.tno == tno1)
				{	
					questions();
					if(l.size() == 2)
					{
						System.err.println("Bed is not available.");
						return;
					}
					else 
					{	
						l.add(p.tno);
						System.out.println("Patient is addmited.");
						return;
					}
				}	
			}
			System.err.println("Token number not Found.");
		}
	}
	public void questions()
	{
		System.out.println("Please answer the following...");
		System.out.println("If yes press - 1, if No press - 2" );
		System.out.println("-----------------------------------------------");	
		System.out.println("1. Do you have fever ? ");
		int ans1 = sc.nextInt();
		System.out.println("2. Do you have head pain ? ");
		int ans2 = sc.nextInt();
		System.out.println("3. Do you have weakness ? ");
		int ans3 = sc.nextInt();
		System.out.println("4. Do you have any other pain ? ");
		int ans4 = sc.nextInt();
		System.out.println("5. Had you eat something food ? ");
		int ans5= sc.nextInt();
		System.out.println("-----------------------------------------------");
	}
	public void sDoct()
	{
		if(l.size() == 0)
		{
			System.err.println("First addmit the patients.");
		}
		else
		{
			System.out.println("Enter Token number");
			int tno1 = sc.nextInt();

			for(int i = 0;i<al.size();i++)
			{
				Patient p = (Patient)al.get(i);
				if(p.tno == tno1)
				{	
					System.out.println("You must have to pay amount :  ");
					p.money=sc.nextDouble();
					System.out.println("Take Rest...!");
					System.out.println();
					return;
				}	
			}
			System.err.println("Token number not Found.");
		}
	}
	public void bill()
	{
		if(l.size() == 0)
		{
			System.err.println("First add Tokens.");
		}
		else
		{
			System.out.println("enter token number");
			int tno=sc.nextInt();
			System.out.println("enter name of patient");
			String name=sc.next();
			for(int i=0;i<al.size();i++)
			{
				Patient p=(Patient)al.get(i);
				if(tno==p.tno && name.equalsIgnoreCase(p.pname))
				{
					System.out.println("You have to pay "+p.money + " rs : " );
					double bal=sc.nextDouble();
					if(bal>=p.money)
					{
						System.out.println("please collect bal"+(bal-p.money));
						System.out.println("Thank you");
						p.money=0;
						l.remove(p.tno);
//					for(int j = i;j<al.size();j++)
//					{
//						Patient p1 = (Patient)al.get(j);
//						p1.tno=p.tno++;
//					}
						return;
					}
					else
					{
						System.out.println("Less Amount.");
						System.out.println("you have to pay" + p.money);
						System.out.println("1.pay now 2.paylater");
						int choice=sc.nextInt();
						if(choice==1)
						{
							bill();
							return;	
						}
						else if(choice==2)
							return;
					}
				}
			}
			System.err.println("token no is not found");
		}
	}	
}
	
