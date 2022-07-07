// A file handling project that enables a user to choose a folder, add, delete and search files
// author @thomami244 Michael Thomas

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class CaltchModule1JavaProject {
	private static JFileChooser dialog;

	File directory;        // File object referring to the directory.
	private static String dialogTitle = " Please choose a folder: ";
	private static Component parent;
	private static String[] files; 


	public static void main(String[] args) {
		System.out.println("Application Name: File Handling Application Prototype\n");
		System.out.println("Developer's Details: Michael Thomas\n");
		System.out.println("Beta Testing Version\n");

		// Creating a popup screen for user to choose a folder path

		try {

			if (dialog == null)
				dialog = new JFileChooser();
		} catch (Exception e1) {

			e1.printStackTrace();
		}
		if (dialogTitle != null)

			dialog.setDialogTitle(dialogTitle); 
		dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // restricts choice to folders only

		int option = dialog.showOpenDialog(parent);
		if (option != JFileChooser.APPROVE_OPTION)
			System.out.println("You didn't select a folder. Please try again");  // User canceled or clicked the dialog's close box.



		java.io.File directory = dialog.getSelectedFile();

		System.out.println("You have selected the folder: \n" + directory.getPath());

		Scanner scan = new Scanner(System.in);

		// Using a switch statement to give user a menu of options to choose from
		char ch;
		do{
			System.out.println("\nFile Operations");
			System.out.println("1. List the file names in ascending order");
			System.out.println("2. Add a file to the existing directory list");
			System.out.println("3. Delete a user specified file from the existing directory list");
			System.out.println("4. Search a user specified file from the main directory");

			int choice = scan.nextInt();
			switch (choice)
			{
			// first case enables the user to list all the files in the folder
			case 1 : 
				System.out.println("You have selected to list the file names in ascending order:");
				files = directory.list();

				//System.out.println(files);
				try
				{ 

					for (int i = 0; i < files.length; i++) {
						System.out.println(files[i]);
					}
				}

				catch(Exception e)
				{
					System.out.println("Error : " +e.getMessage());
				}                         
				break; 

				// second case enables the user to a file called called helloWorld.txt 
				// to the existing directory list
			case 2 : 

				try {  
					System.out.println("What is the name of the file you'd like to add to the directory list:"); 
					String path = directory.getPath();
					Scanner add = new Scanner(System.in);
					String addFile = add.next();

					File file = new File(path + "//" + addFile);  // this is used to create the file

					if (file.createNewFile()) {  
						System.out.println("New File is created!");  
					} else {                   
						if(file.exists())
						{
							System.out.println("File already exists.");	
							System.out.println("File path:" + file.getAbsolutePath());
							System.out.println("File name:  " + file.getName());
							System.out.println("File class:  " + file.getClass());
							System.out.println("File parent:  " + file.getParent());
							System.out.println("File space allocated:  " + file.getUsableSpace());
							System.out.println("File length: " + file.length());
							System.out.println("File list:   " + file.list());

						}
						else
						{
							System.out.println("File not found.");
						}


					}  
				} catch (IOException e) {  
					e.printStackTrace();  
				}  	  

				break;    

				// the third case enables the user to delete a file in the directory list
			case 3 : 
				System.out.println("You have selected to Delete a file from the existing directory list:"); 
				System.out.println("Which file would you like to delete from the current directory:"); 
				files = directory.list();

				//Print the files in the current directory

				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i]);

				}
				
				Scanner delete = new Scanner(System.in);
				String deleteFile = delete.next();
				String path = directory.getPath();
				boolean b = false;
				
				// to check for capitilization and delete file if found
				for (int i = 0; i < files.length; i++) {
					
					if (files[i].equals(deleteFile)) {
						File file = new File(path + "//" + deleteFile); 
						b = file.delete();
						break;
					}
		

				}

				
				if(b==true)
				{
					System.out.println("File deleted !!");
				}
				else
				{
					System.out.println("File not deleted. Check for capitilizations.");
				}


				break;

				// fourth case enables a user to search for a file in a directory
			case 4 : 
				System.out.println("You have selected to Search a user specified file from the main directory.");
				files = directory.list();
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i]);

				}
				
				Scanner find = new Scanner(System.in);
				String findFile = find.next();
				files = directory.list();
				int count = 0;
				for (int i = 0; i < files.length; i++) {
					if (findFile.equals(files[i])) {
						count +=1;
					}
				}

				if (count>0) {
					System.out.println("\n");
					System.out.println(findFile + " is found in the directory");
				}
				else {					
					System.out.println("Sorry, that file cannot be found in the folder + " + directory.getPath());
				}
				

			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		}while (ch == 'Y'|| ch == 'y');     // switch statement continues so long as user clicks Y or y
		if (ch == 'N' || ch == 'n') {
			 java.lang.System.exit(0);
		}


	}


}
