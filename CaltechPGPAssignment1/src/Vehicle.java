//Assignment 1: Caltech PGP Module
// abstract classes/ overloading of functions
//github@thomami244 Michael Thomas

// Creating parent class
abstract public class Vehicle {

	//declare two variables - int speed and long distance
	public int speed= 80;
	public long distance= 300;

	//create constructors- default 

	public Vehicle() {
		System.out.println("\n\nThis is the parent's default constructor that is called whenever a new object of the parent type is instantiated");
	}

	//create constructor- parameterized
	public Vehicle(int paramterValue) {

	}

	// creating two abstract methods
	abstract public void run();
	abstract public void stop();

	//create three methods of public void fuel - 1st method will take int  

	public void fuel(int intValue) {
		System.out.println("This is the parent vehicle's fuel method that takes int parameter");
	}

	//create three methods of public void fuel - 2nd method will float and string

	public void fuel(float floatValue, String stringValue) {
		System.out.println("This is the parent vehicle's fuel method that takes float and String parameters");
	}

	//create three methods of public void fuel - 3rd method will take char and int (method overloading)
	public void fuel(char charValue, int intValue) {
		System.out.println("This is the parent vehicle's fuel method that takes char and int parameters");
	}

}


// creating child of parent class vehicle
class TwoWheeler extends Vehicle{

	// declare two variables - int speed and long distance 
	//with different values from the parent vehicle
	public static int speed= 200;
	public static long distance= 400;

	static int  nos_of_tyre = 2;

	//default constructor of twoWheeler class
	public TwoWheeler() {
		super();
		System.out.println("This is the TwoWheeler constructor");
	}

	// methods inherited from the parent abstract class
	@Override
	public void run() {
		System.out.println("This is the run method in the TwoWheeler class");

	}

	@Override
	public void stop() {
		System.out.println("This is the stop method in the TwoWheeler class");
	}


	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of twoWheeler class is " + speed);
		System.out.println("The distance of twoWheeler class is " + distance);
		System.out.println("The number of tyres in a twoWheeler is " + nos_of_tyre);


		System.out.println("The speed of super parent Vehicle class is " +  super.speed);
		System.out.println("The distance of super parent Vehicle class is " + super.distance);

	}



}

class ThreeWheeler extends Vehicle{
	// declare two variables - int speed and long distance 
	//with different values from the parent vehicle
	public static int speed= 175;
	public static long distance= 425;

	static int  nos_of_tyre = 3;


	// create default constructor
	public ThreeWheeler() {
		super();
		System.out.println("This is the ThreeWheeler constructor");

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		System.out.println("This is the run method in the ThreeWheeler class");

	}

	@Override
	public void stop() {
		System.out.println("This is the stop method in the ThreeWheeler class");

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of threeWheeler class is " + speed);
		System.out.println("The distance of threeWheeler class is " + distance);
		System.out.println("The number of tyres in a threeWheeler is " + nos_of_tyre);


		System.out.println("The speed of super parent Vehicle class is " +super.speed);
		System.out.println("The distance of super parent Vehicle class is " + super.distance);

	}

}

class FourWheeler extends Vehicle{
	// declare two variables - int speed and long distance 
	//with different values from the parent vehicle
	public static int speed= 150;
	public static long distance= 450;

	static int  nos_of_tyre = 4;


	// create default constructor
	public FourWheeler() {
		super();
		System.out.println("This is the FourWheeler constructor");

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		System.out.println("This is the run method in the FourWheeler class");

	}

	@Override
	public void stop() {
		System.out.println("This is the stop method in the FourWheeler class");

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of fourWheeler class is " + speed);
		System.out.println("The distance of fourWheeler class is " + distance);
		System.out.println("The number of tyres in a fourWheeler is " + nos_of_tyre);


		System.out.println("The speed of super parent Vehicle class is " +super.speed);
		System.out.println("The distance of super parent Vehicle class is " + super.distance);

	}

}

class EightWheeler extends Vehicle{
	// declare two variables - int speed and long distance 
	//with different values from the parent vehicle
	public static int speed= 125;
	public static long distance= 475;

	static int  nos_of_tyre = 8;


	// create default constructor
	public EightWheeler() {
		super();
		System.out.println("This is the EightWheeler constructor");

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		System.out.println("This is the run method in the EightWheeler class");

	}

	@Override
	public void stop() {
		System.out.println("This is the stop method in the EightWheeler class");

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of EightWheeler class is " + speed);
		System.out.println("The distance of EightWheeler class is " + distance);
		System.out.println("The number of tyres in a EightWheeler is " + nos_of_tyre);
	
		System.out.println("The speed of super parent Vehicle class is " +super.speed);
		System.out.println("The distance of super parent Vehicle class is " + super.distance);

	}




	public static void main(String[] args) {
		
		 // - call all the methods using dynamic/runtime polymorphism here
		 // - all the methods of all the child classes.
		 // - call all the methods of the fuel of Vehicle class
		
		
		
		TwoWheeler twoWheelVehicle = new TwoWheeler();
		twoWheelVehicle.display();
		twoWheelVehicle.run();
		twoWheelVehicle.stop();
		twoWheelVehicle.fuel(1000);
		twoWheelVehicle.fuel(1000, "this is any string");
		twoWheelVehicle.fuel('a', 1000);
		
		
		
		ThreeWheeler threeWheelVehicle = new ThreeWheeler();
		threeWheelVehicle.display();
		threeWheelVehicle.run();
		threeWheelVehicle.stop();
		threeWheelVehicle.fuel(1000);
		threeWheelVehicle.fuel(1000, "this is any string");
		threeWheelVehicle.fuel('a', 1000);
		
		FourWheeler fourWheelVehicle = new FourWheeler();
		fourWheelVehicle.display();
		fourWheelVehicle.run();
		fourWheelVehicle.stop();
		fourWheelVehicle.fuel(1000);
		fourWheelVehicle.fuel(1000, "this is any string");
		fourWheelVehicle.fuel('a', 1000);
		
		EightWheeler eightWheelVehicle = new EightWheeler();
		eightWheelVehicle.display();
		eightWheelVehicle.run();
		eightWheelVehicle.stop();
		eightWheelVehicle.fuel(1000);
		eightWheelVehicle.fuel(1000, "this is any string");
		eightWheelVehicle.fuel('a', 1000);
		
		
		
		


	}
}
