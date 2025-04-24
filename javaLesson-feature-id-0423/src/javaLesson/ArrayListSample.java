package javaLesson;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
	
	public static void main(String[] args) {
		List <String> fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("potato");
		fruitsList.add(1,"grape");
		fruitsList.add(1,"peach");
		
		//2番目の要素:grape
		String element0 = fruitsList.get(2);
		System.out.println("2番目の要素:"+ element0 );
				
		fruitsList.remove(3);
		fruitsList.remove("peach");
		System.out.println(fruitsList);

	}	
		
}
