//second assignment on TreeSets
// @thomami244 Michael Thomas


import java.util.TreeSet;

public class TreeSetAssignment2 {

	public static void main(String[] args) {
		TreeSet<String> progLanguages = new TreeSet();
		
		progLanguages.add("Java");
		progLanguages.add("Python");
		progLanguages.add("C++");
		progLanguages.add("RubyOnRails");
		progLanguages.add("SQL");
		progLanguages.add("PHP");
		
		System.out.println("The 6 programming languages are: " + progLanguages);
		
		progLanguages.remove("Python");
		progLanguages.remove("SQL");
		
		System.out.println("The set after deleting 2 languages is: " + progLanguages);
		
		progLanguages.add("HTML");
		progLanguages.add("CSS");
		progLanguages.add("JavaScript");
		
				
		System.out.println("The set after adding 3 more languages is: " + progLanguages);
		
		
		
		System.out.println("Does the set contain Java? " + progLanguages.contains("Java"));
		
		progLanguages.clear();
		
		System.out.println("The set after deleting all is:" + progLanguages);
		
		
	}

}
