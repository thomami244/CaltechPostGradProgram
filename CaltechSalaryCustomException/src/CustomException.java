import java.util.Scanner;

public class CustomException{  
	
	
	   static void validate(int salary)throws SalaryException{  
	     if(salary<2100)  {
	      throw new SalaryException("you need to work hard");  }
	     else if(salary<5000)  
		      throw new SalaryException("\"your salary is somehow good");  
	     else  
	      System.out.println("salary is very good");  
	   }  
	     
	   public static void main(String args[]){  
		   Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		   System.out.print("How much is your salary? ");  
		   int a= sc.nextInt();  
		   
	      try{  
	        validate(a);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	      sc.close();
	  }  
	   
	   
	}  

//This class is created for your own defined exception message
class SalaryException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	SalaryException(String s){  //2
	  super(s);  
	 }  
}  
