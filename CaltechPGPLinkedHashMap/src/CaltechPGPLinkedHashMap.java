// This program illustrates the application of HashMaps
// author @thomami244 Michael Thomas


import java.util.LinkedHashMap;
import java.util.Map;

public class CaltechPGPLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer, String> fruits = new LinkedHashMap<Integer, String>();

		fruits.put(0, "banana");
		fruits.put(1, "papaya");
		fruits.put(2, "orange");
		fruits.put(3, "grapefruit");
		fruits.put(4, "figs");
		fruits.put(5, "apple");
		fruits.put(6, "Watermelon");
		fruits.put(7, "Cherry");
		fruits.put(8, "Strawberry");
		fruits.put(9, "Raspberry");

		System.out.println("Contents of Fruits : " + fruits);

		for (Integer key : fruits.keySet()) {
			System.out.println(key + ":\t" + fruits.get(key));

		}

		fruits.remove(4);
		fruits.remove(7);
		System.out.println("\nContents of Fruits after deleting 4th and 7th elements: \n" + fruits);
		System.out.println("\nDoes the map contain banana and apple: \n" + (fruits.containsValue("banana") && fruits.containsValue("apple")));
		System.out.println("\nThe HashCode of the map is: \n" + fruits.hashCode());
		fruits.clear();
		System.out.println("\nContents of Fruits after clearing the map: \n" + fruits);


	}

}
