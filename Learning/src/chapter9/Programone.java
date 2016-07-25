package chapter9;

public class Programone {
	public static void main(String args[])
	
	{
		String s1="I like it";
		String s5="I like it";
		String s2=new String("i like it");
		String s6="I like ita";
		char arr[]={'g','a','r','i','m','a'};
		String s3=new String(arr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s2+s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s4=s3.concat(s2);
		System.out.println(s4);
		char ch;
		ch=s4.charAt(4);
		System.out.println(ch);
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s6));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("I like"));
		System.out.println(s3.endsWith("ma"));
		System.out.println(s3.indexOf("a"));
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s3.replace("i","t"));
		System.out.println(s3.substring(0, 5));
		
	
			
		
		
		
		
	}

}
