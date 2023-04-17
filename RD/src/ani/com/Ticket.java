package ani.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket 
{
	int tid;
	String from;
	String to;
	String date;

	Scanner sc  = new Scanner(System.in);
	
	List tl = new ArrayList();

	public Ticket() 
	{
	}
	public Ticket(String from, String to, String date,int tid) 
	{
		this.from = from;
		this.to = to;
		this.date = date;
		this.tid=tid;
	}
	public void bookTicket()
	{
		int tid = tl.size()+1;
			System.out.println("Ticket id : " + tid);
	
			System.out.print("Book Ticket from : " ); 
			String from  = sc.next();
			System.out.print("To : " );
			String to  = sc.next();
			System.out.print("Date : " );
			String date  = sc.next();
		
			Ticket t = new Ticket(from,to,date,tid);
			tl.add(t);
		
	}
	public void cancelTicket()
	{
		System.out.print("Enter Ticket id: " ); 
		int tid  = sc.nextInt();
		
		for(int i = 0;i<tl.size();i++)
		{
			Ticket t1 = (Ticket)tl.get(i);
			
			if(t1.tid==tid)
			{
				tl.remove(t1);
				return;
			}
		}
		System.err.println("Ticket not found.");
	}
	public void changeDate()
	{
		System.out.print("Enter Ticket id: " ); 
		int tid  = sc.nextInt();
		
		for(int i = 0;i<tl.size();i++)
		{
			Ticket t1 = (Ticket)tl.get(i);
			
			if(t1.tid==tid)
			{
				System.out.print("Enter Date: " );
				String dt = sc.next();  
				t1.date=dt;
				return;
			}
		}
		System.err.println("Ticket not found.");
	}
	@Override	
	public String toString() 
	{
			return " Ticket id = " + tid +  "\n"+
					   " From = " + from + "\n" +
					   " To = " + to + "\n" +
					   " Date = "+ date;	
	}
}
