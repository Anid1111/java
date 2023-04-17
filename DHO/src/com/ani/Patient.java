package com.ani;

public class Patient 
{
	int tno =0;
    String pname;
    long mobno;
    String add;
    double money;

    public Patient()
	{
	}
	public Patient(int tno,String pname,long mobno,String add) 
	{
		this.tno = tno;
		this.pname = pname;
		this.mobno = mobno;
		this.add = add;
	}
	public Patient(double money)
	{
		this.money=money;
		
	}
	public String toString()
	{
		String data="";
		data=data+"{Token no = "+tno+" "+
		" Name = "+pname+" "+" MobNo = "+ mobno+" Add = "+add;
		return data+"}";
	}
}
