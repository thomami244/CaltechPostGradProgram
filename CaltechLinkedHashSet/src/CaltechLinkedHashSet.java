// first assignment on HashSets
// The first HashSet is generic
// The second is a String HashSet
// @thomami244 Michael Thomas


import java.util.LinkedHashSet;
import java.util.Scanner;

public class CaltechLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet genericSet = new LinkedHashSet();  // object creation of LinkedHashSet generic
		genericSet.add(3);
		genericSet.add(10);
		genericSet.add(5.6);
		genericSet.add(9.8);
		genericSet.add("Character1");
		genericSet.add("Character2");
		genericSet.add(true);
		
		LinkedHashSet<String> stringSet = new LinkedHashSet(); 
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first String ");
		String firstChar;
		firstChar = in.nextLine();
		stringSet.add(firstChar);
		System.out.println("Please enter the second String ");
		String secondChar;
		secondChar = in.nextLine();
		stringSet.add(secondChar);
		
System.out.println("The generic hashset is " + genericSet);
System.out.println("The String hashset is " + stringSet);
		
	}

}
