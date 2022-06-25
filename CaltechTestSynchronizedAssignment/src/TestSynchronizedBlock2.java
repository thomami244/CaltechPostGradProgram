// this example creates four threads to a synchronised calculate method
// the four threads have different priority levels
// thread1 passes 4 to the calculate method and calculates the factorial
// thread2 passes 6 to the calculate method and calculates the factorial
// thread3 passes 4 & 5 to the calculate method and calculates the sum
// thread4 passes 20 & 10 to the calculate method and calculates the sum
// the order of priorities of execution is thread2 (highest), thread4, thread1, and thread3 (lowest)
// @thomami244 Michael Thomas



class Table{  

	// the synchronized block receives a variable length of integers
	// if one int is received, then the factorial is calculated
	// if two int's are received, then the sum is calculated

	synchronized void calculate(int...values){  

		if (values.length==1)

		{System.out.println("I am into the factorial part of the calculate method");

		int result=1;

		for (int factor = 2; factor <= values[0]; factor++) {
			result *= factor;
		}

		System.out.println("The factorial of " + values[0] + " is "+ result);
		}

		else if (values.length==2)

		{System.out.println("I am into the sum part of the calculate method");

		int result = values[0] + values[1];


		System.out.println("The sum of " + values[0] + " and " + values[1] + " is "+ result);
		}
		else {
			System.out.println("Please check the number of variables passed to the calculate method");

		}
	}//end of the method  
}  

class Thread1 extends Thread{  
	Table t;  
	Thread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("\nInto the Thread1 run() method");
		t.calculate(4);  
	}  

}  
class Thread2 extends Thread{  
	Table t;  
	Thread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("\nInto the Thread2 run() method");
		t.calculate(6);  
	}  
}  

class Thread3 extends Thread{  
	Table t;  
	Thread3(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("\nInto the Thread3 run() method");
		t.calculate(4,5);  
	}  
}  

class Thread4 extends Thread{  
	Table t;  
	Thread4(Table t){  
		this.t=t;  
	}  
	public void run(){  
		System.out.println("\nInto the MyThread4 run() method");
		t.calculate(20,10);  
	}  
}  

public class TestSynchronizedBlock2{  

	public static void main(String args[]){  

		Table obj = new Table();//only one object  

		Thread1 t1=new Thread1(obj);  
		Thread2 t2=new Thread2(obj);  
		Thread3 t3=new Thread3(obj);  
		Thread4 t4=new Thread4(obj);  

		// sets the priority of the threads
		t2.setPriority(10);  
		t4.setPriority(7);  
		t1.setPriority(4);  
		t3.setPriority(1);  

		// starting all the threads at the same time
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}  
}  