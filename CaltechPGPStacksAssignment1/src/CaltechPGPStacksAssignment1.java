// this program shows basci functionality for Stack data class
// author @thomami244 Michael Thomas

import java.util.Stack;

public class CaltechPGPStacksAssignment1 {
	
	static int intVar1;
	static int intVar2;
	static int intVar3;
	static int intVar4;
	static int intVar5;
	static char charVar1;
	static char charVar2;
	

	public static void main(String[] args) {
		Stack assortedItems = new Stack();
		
		assortedItems.push("Apple");
		assortedItems.push("Banana");
		assortedItems.push("Orange");
		assortedItems.push("Cherry");
		assortedItems.push("Figs");
		assortedItems.push("London");
		assortedItems.push("Lisbon");
		assortedItems.push("Bangkok");
		assortedItems.push("Johanesburg");
		assortedItems.push(intVar1);
		assortedItems.push(intVar2);
		assortedItems.push(intVar3);
		assortedItems.push(intVar4);
		assortedItems.push(charVar1);
		assortedItems.push(charVar2);
		
		System.out.println("The stack is: \n" + assortedItems);
		
		// remove 5 elements
		
		assortedItems.pop();
		assortedItems.pop();
		assortedItems.pop();
		assortedItems.pop();
		assortedItems.pop();
		System.out.println("\n The stack after deleting 5 items is: \n" + assortedItems);
		
		//peek element
		
		System.out.println("\n The peek element is: \n" + assortedItems.peek());
		
		// remove 2 elements
		
		assortedItems.pop();
		assortedItems.pop();
		System.out.println("\n The stack after deleting 2 items is: \n" + assortedItems);

		//check top of stack and print
		System.out.println("\n The first element in the stack is: " + assortedItems.firstElement());
		
		//check index of "Apple" and "Delhi"
		System.out.println("\n The index of Apple is: \n" + assortedItems.indexOf("Apple"));
		System.out.println("\n The index of Delhi is: \n" + assortedItems.indexOf("Delhi"));
		
		
	}

}
