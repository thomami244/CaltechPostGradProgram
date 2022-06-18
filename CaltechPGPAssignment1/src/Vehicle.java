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

	}

	//create constructor- parameterized
	public Vehicle(int paramterValue) {

	}

	// creating two abstract methods
	abstract public void run();
	abstract public void stop();

	//create three methods of public void fuel - 1st method will take int  

	public static void fuel(int intValue) {

	}

	//create three methods of public void fuel - 2nd method will float and string

	public static void fuel(float floatValue, String stringValue) {

	}

	//create three methods of public void fuel - 3rd method will take char and int (method overloading)
	public static void fuel(char charValue, int intValue) {

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

	}


	// methods inherited from the parent abstract class
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}


	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("The speed of twoWheeler class is " + speed);
		System.out.println("The distance of twoWheeler class is " + distance);
		System.out.println("The number of tyres in a twoWheeler is " + nos_of_tyre);


		Vehicle vehicle = new TwoWheeler();
		System.out.println("The speed of super parent Vehicle class is " +vehicle.speed);
		System.out.println("The distance of super parent Vehicle class is " + vehicle.distance);

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

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of threeWheeler class is " + speed);
		System.out.println("The distance of threeWheeler class is " + distance);
		System.out.println("The number of tyres in a threeWheeler is " + nos_of_tyre);


		Vehicle vehicle = new ThreeWheeler();
		System.out.println("The speed of super parent Vehicle class is " +vehicle.speed);
		System.out.println("The distance of super parent Vehicle class is " + vehicle.distance);

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

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of fourWheeler class is " + speed);
		System.out.println("The distance of fourWheeler class is " + distance);
		System.out.println("The number of tyres in a fourWheeler is " + nos_of_tyre);


		Vehicle vehicle = new FourWheeler();
		System.out.println("The speed of super parent Vehicle class is " +vehicle.speed);
		System.out.println("The distance of super parent Vehicle class is " + vehicle.distance);

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

	}

	//oveeride the two methods - run() and stop()
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	//create method display() 
	//this will print the three variables of 2W  
	//all the variable of the parent Vehicle  
	public void display() {
		System.out.println("\n The speed of EightWheeler class is " + speed);
		System.out.println("The distance of EightWheeler class is " + distance);
		System.out.println("The number of tyres in a EightWheeler is " + nos_of_tyre);


		Vehicle vehicle = new EightWheeler();
		System.out.println("The speed of super parent Vehicle class is " +vehicle.speed);
		System.out.println("The distance of super parent Vehicle class is " + vehicle.distance);

	}




	public static void main(String[] args) {
		
		 // - call all the methods using dynamic/runtime polymorphism here
		 // - all the methods of all the child classes.
		 // - call all the methods of the fuel of Vechile class
		
		TwoWheeler twoWheelVehicle = new TwoWheeler();
		ThreeWheeler threeWheelVehicle = new ThreeWheeler();
		FourWheeler fourWheelVehicle = new FourWheeler();
		EightWheeler eightWheelVehicle = new EightWheeler();
		
		twoWheelVehicle.display();
		threeWheelVehicle.display();
		fourWheelVehicle.display();
		eightWheelVehicle.display();

		


	}
}
