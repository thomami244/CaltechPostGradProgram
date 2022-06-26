// This assignment uses DataInputStream, FileOutputStream, and BufferedOutputStream
// to append new elements to a text file, using a @ delimiter
// And then uses FileInputStream to read the file
// @thomami244 Michael Thomas


import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileInputOutputStream {
	 public static void main(String[] args) throws IOException  
	    { 
		 //Step 1: attach keyboard to DataInputStream 
	        DataInputStream dis=new DataInputStream(System.in); 
	  
	        // Step 2: attach file to FileOutputStream 
	        FileOutputStream fout=new FileOutputStream("../file.txt",true); 
	  
	        //Step 3:attach FileOutputStream to BufferedOutputStream 
	        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
	        System.out.println("Enter text (@ at the end):"); 
	        char ch; 
	  
	        //read characters from dis into ch. Then write them into bout. 
	        //repeat this as long as the read character is not @ 
	        while((ch=(char)dis.read())!='@') 
	        { 
	            bout.write(ch); 
	        } 
	        //close the file 
	        bout.close(); 
		 
		 
		 //attach the file to FileInputStream 
	      FileInputStream fin= new FileInputStream("../file.txt");
	      //illustrating getChannel() method 
	      System.out.println(fin.getChannel()); 
	      
	 

	      //illustrating getFD() method 
	      //Returns the FileDescriptor object that represents the connection to the actual file
	      //in the file system being used by this
	      //System.out.println(fin.getFD()); 

	      //illustrating available method 
	      //Returns an estimate of the number of remaining bytes that can be read (or skipped over)
	      //from this input stream
	      System.out.println("Number of bytes read:"+fin.available()); 

	      //illustrating skip method 
	      /*Original File content: 
	      * This is my first line 
	      * This is my second line*/
	      fin.skip(7); 
	      System.out.println("FileContents :"); 
	      //read characters from FileInputStream and write them 
	      int charact; 
	      while((charact=fin.read())!=-1) 
	          System.out.print((char)charact); 
	        
	      //close the file 
	      fin.close(); 
	      
	      	 
	       
	    } 
	} 



