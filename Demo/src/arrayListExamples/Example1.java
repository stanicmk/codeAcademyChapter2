package arrayListExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		System.out.println(fruits.isEmpty());
		
		fruits.add("Apple");
		fruits.add("Oraange");
		
		fruits.add(0, "Watermelon");
		
		System.out.println("Element with index 1 has value: " + fruits.get(1));
		
		System.out.println(fruits.toString());
	
		
		fruits.remove(0);
		fruits.remove("Apple");
		
		fruits.clear();
		
		
		System.out.println(fruits);
		
		
		for (String string : fruits) {
			
		}
		
		

	}

}
