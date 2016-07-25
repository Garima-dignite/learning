package com.string;

public class Bh {
	String str = "2342314323235155";

	public static void main(String args[])
	{
		Bh a = new Bh();
		String t = a.Func(a.str);
		System.out.println(t);

	}


public String Func(String str)
{String out="";
	for(char ch:str.toCharArray())
  {
	if(out.indexOf(ch)<0)
	{
		out=out+ch;
	}
}
	return out;
}}
