package chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String args[]) throws FileNotFoundException
	{
		File text=new File("C:/Users/Garima/Practice/text.txt");
		Scanner sc=new Scanner(text);
	
		//int lineNumber = 1;
        //while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println("line " /*+ lineNumber + " :"*/ + line);
            //lineNumber++;

        }
	}

//}
