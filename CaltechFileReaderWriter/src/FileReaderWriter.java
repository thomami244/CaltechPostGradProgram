// This example uses FileWriter to write to a text file,
// and FileReader to read the file
// @thomami244 Michael Thomas

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReaderWriter {


	public static void main(String args[]) {
		Scanner data = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String str= data.nextLine();              //reads string   
		System.out.print("You have entered: "+str);  
		data.close();



		try {
			// Step 1: Creates a Writer using FileWriter
			FileWriter output = new FileWriter("../file.txt");

			//File k = new File("../file.txt");

			// Step 2: Writes string to the file
			output.write(str);
			System.out.println("\nData is written to the file:");

			// Step 3: Closes the writer
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}

		try {
			// Step 1: Creates a reader using the FileReader
			File input = new File("../file.txt");

			// Step 2: Reads characters
			System.out.print("Reading from file: ");

			try (FileReader fr = new FileReader(input))
			{
				int content;
				while ((content = fr.read()) != -1) {
					System.out.print((char) content);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			

		}
		finally{
			
		}
	}


	}
