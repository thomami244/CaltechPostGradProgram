public class ThreadPriority extends Thread{  

	public void run(){  
		 
			try{
				Thread.sleep(4000);  // 4000 miliseconds = 4 secs
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}  

			System.out.println("\nrunning thread name is:"+Thread.currentThread().getName());  // name of the thread
			//System.out.println(" The thread group is:" + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getThreadGroup()); // a group in whihc thread is assgined
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running			
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
			System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());  //what is current prirotiy of thread			
			//System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
			
			System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon()); // this thread always run in background
		} 
	

	public static void main(String args[]){  

		ThreadPriority m1=new ThreadPriority();  
		ThreadPriority m2=new ThreadPriority();  
		ThreadPriority m3=new ThreadPriority();

		m1.setName("Name: High Priority Thread");
		m2.setName("Name: Normal Priority Thread 1");
		m3.setName("Name: Normal Priority Thread 2");

		m1.setPriority(Thread.MAX_PRIORITY);  
		m2.setPriority(Thread.NORM_PRIORITY);  
		m3.setPriority(Thread.NORM_PRIORITY); 


		m1.start();  
		m2.start();  
		m3.start();

	}  
}     
