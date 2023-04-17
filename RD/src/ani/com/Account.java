package ani.com;

import java.util.Scanner;

public class Account 
{
		String name ;
		String uid;
		int pass;
		long cno;
		Object ob;
		Scanner sc = new Scanner(System.in);
		public Account()
		{
		}
		public Account(String name,String uid,int pass,long cno) 
		{
			this.name=name;
			this.uid=uid;
			this.pass=pass;
			this.cno=cno;
		}
		public String toString()
	{
		return "name = "+ this.name +", User id = "+ this.uid+" , "+ "contct no = "+ this.cno;
	}
		

}
