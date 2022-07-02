// LinkedList program, showing basic operations
// author @thomami244 Michael Thomas

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CaltechLinkedListAssignment3 {

	public static void main(String[] args) {

		LinkedList<String> months = new LinkedList<String>();

		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("April");
		months.add( "November");
		months.addLast("December");
		months.addFirst("January");
		months.add(2,"March");
		months.add(2, "February");
		months.add(8, "September");
		months.add(9, "October");

		months.remove(7);
		months.add(4, "April");

		months.remove(1);
		months.add(4, "May");

		System.out.println(" The linkedlist with the months displayed in order is: \n"+ months);

		System.out.println("\n");
		
		
		
		int count =0 ;
		java.util.Iterator<String> itr = months.iterator();
		while(itr.hasNext()) {
			count +=1;
			if (count % 2 == 0 ) {
				System.out.println("The even months are "+ itr.next());
			}
			else {
				itr.next();
			}

		}
		System.out.println("\n");
		int count2 =0;
		java.util.Iterator<String> itr2 = months.iterator();
		while(itr2.hasNext()) {
			count2 +=1;
			if (count2 % 2 == 0 ) {
				itr2.next();
			}
			else {
				System.out.println("The odd months are "+ itr2.next());
				
			}
		}
		
		System.out.println("\n");
		
		java.util.Iterator<String> itr3 = months.iterator();
		while(itr3.hasNext()) {
			
				System.out.println("All the months printed with the iterator: "+ itr3.next());			
			}
		
		System.out.println("\n");
		System.out.println("The first and last months of the year are: " + months.getFirst()+ " and " + months.getLast());
		
		months.remove(5);
		System.out.println(" The linkedlist after my birthday month (June) is removed: \n"+ months);
		
		System.out.println("\n");
		System.out.println("Does the link contain winter months -December, January, or February?" + (months.contains("December")|| months.contains("January")|| months.contains("February")));
		
		
		System.out.println("\n");
		System.out.println("Fetch the first and last months using peek(): "+ months.peekFirst() + " and " + months.peekLast());
		
		System.out.println("\n");
		
System.out.println("Remove the first and last months using poll(): "+ months.pollFirst() + " and " + months.pollLast());
		
		System.out.println("\n");
		
		//
		System.out.println("After all the adjustments, the linkedlist is: \n"+ months);
			
	}

}
