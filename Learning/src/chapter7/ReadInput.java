package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
public static void main(String args[]) throws IOException
{
	InputStreamReader obj=new InputStreamReader(System.in);
	BufferedReader bf=new BufferedReader(obj);
	System.out.println("Enter a number:");
	int a=Integer.parseInt(bf.readLine());
	System.out.println("Enter another number:");
	int b=Integer.parseInt(bf.readLine());
	int c=a+b;
	System.out.println("The sum is "+c);

}
}
