// This banking program start with a bank balance of 10,000 
// which gets adjusted by 4 threads
// Thread1 draws 5000
// Thread2 draws 4000
// Thread3 attempts to draw 10,000 but due to
// insufficient balance gets put on sleep
// Thread4 then deposits 20,000 in the bank and notifies the other threads
// Then Thread3 resumes the withdrawal of 10,000
// @thomami244 Michael Thomas

class Customer{  
	int amount=10000;  

	synchronized void withdraw(int amount){  
		System.out.println("\nThe balance on your account is " + this.amount);  
		System.out.println("Going to attempt to withdraw " + amount);  

		if(this.amount<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  		
			try{
				wait();
			}
			catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("You succesfully withdrew " + amount + " and the balance in your account is "+ this.amount);  
	}  

	synchronized void deposit(int amount){  
		System.out.println("\nThe balance on your account is " + this.amount); 
		System.out.println("Going to attempt to deposit " + amount);  
		this.amount+=amount;  

		System.out.println("You deposited " + amount + " and the final balance is " + this.amount);  
		notify();  //unlocking of thread
	}  
}  

public class Simple_Wait_Notify{  
	public static void main(String args[]){  
		final Customer c=new Customer();  


		// Thread1 attempts to withdraw 5,000
		new Thread(){                 // anonymous class
			public void run()
			{
				c.withdraw(5000);
			}  
		}.start();  

		// Thread2 attempts to withdraw 4,000
		new Thread(){                 // anonymous class
			public void run()
			{
				c.withdraw(4000);
			}  
		}.start(); 

		// Thread3 attempts to withdraw 10,000
		new Thread(){                 // anonymous class
			public void run()
			{
				c.withdraw(10000);
			}  
		}.start(); 
		
		// Thread4 deposits 20,000
		new Thread(){  				// anonymous class
			public void run()
			{
				c.deposit(20000);
			}  
		}.start();    
	}}