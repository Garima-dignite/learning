package chapter7;

public class Scanner {
	public static void main(String args[]) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter name:");
		String str=sc.next();
		System.out.println("Enter a integer:");
		int a=sc.nextInt();
		System.out.println("Name="+str);
		System.out.println("Number="+a);
		
	}
}