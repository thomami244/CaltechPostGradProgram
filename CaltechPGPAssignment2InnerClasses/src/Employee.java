// This example looks at inner classes and inner method classes
// github: thomami244 
// Michael Thomas


public class Employee {
	// Current Salaries for permanent, temporary, and contract workers
	int salaryPE01 = 100;	
	int salaryTE01 = 80;
	int salaryCE01= 120;

	// This class calculates the new salary for permanent workers 
	// and outputs the old salary, employee code, and hike
	class PermEmployee{
		int salary;
		double hike= 0.45;
		String code = "PE01";

		void new_salary(){
			salary = (int)(salaryPE01*(1+hike));
			System.out.println("\nThe new salary for full-time employees is: " + salary );

		}
		public void display(){
			Employee employee = new Employee();
			System.out.println("The old salary for full-time employees is " + employee.salaryPE01 + " code: " + code + " with hike: " + hike);
		}
	}
	// This class calculates the new salary for temporary workers 
	// and outputs the old salary, employee code, and hike
	class TempEmployee{
		int salary;
		double hike= 0.3;
		String code = "TE01";

		void new_salary(){
			salary = (int)(salaryTE01*(1+hike));
			System.out.println("\nThe new salary for temporary employees is: " + salary );

		}
		public void display(){
			Employee employee = new Employee();
			System.out.println("The old salary for temporary employees is " + employee.salaryTE01 + " code: " + code + " with hike: " + hike);
		}
	}

	void role(){
		
		// This class calculates the new salary for contract workers 
		// and outputs the old salary, employee code, and hike
		class ContractEmployee{

			int salary;
			double hike= 0.3;
			String code = "CE01";

			void new_salary(){
				salary = (int)(salaryCE01*(1+hike));
				System.out.println("\nThe new salary for contract employees is: " + salary );

			}
			public void display(){
				Employee employee = new Employee();
				System.out.println("The old salary for contract employees is " + employee.salaryCE01 + " code: " + code + " with hike: " + hike);
			}

		}
		ContractEmployee contractEmployee = new ContractEmployee();  //---> object creation of the local innerClass
		contractEmployee.new_salary();
		contractEmployee.display();
	}


	public static void main(String[] args) {
		Employee emp = new Employee();
		
		// accessing the methods for permanent employees
		Employee.PermEmployee permEmployee =  emp.new PermEmployee();

		permEmployee.new_salary();
		permEmployee.display();
		
		// accessing the methods for temporary employees

		Employee.TempEmployee tempEmployee =  emp.new TempEmployee();

		tempEmployee.new_salary();
		tempEmployee.display();

		emp.role();
		// accessing the methods for contract employees

	}

}
