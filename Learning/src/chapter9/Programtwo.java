package chapter9;

public class Programtwo {
	public static void main(String args[])
	{
		String str="Hello thid is java program";
		char a[]=new char[20];
		str.getChars(5,11,a,6);
System.out.println(a);
	}

}
