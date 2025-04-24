package javaLesson;

import java.util.ArrayList;

public class Testresult {

	public static void main(String[] args) {
		ArrayList <Integer> TestList = new ArrayList<> ();
		TestList.add(85);
		TestList.add(92);
		TestList.add(78);
		TestList.add(65);
		TestList.add(98);
		TestList.add(70);
		
		int i = 0;
		
		
		for (Integer score : TestList ) {
			if ( score >= 70 ) {
				i++;
				
			}	
		}
		System.out.println("70点以上の得点の数は" +i+ "個です。");
//		int i = 70;
//		if (i >= 70 ) {
//			System.out.println("70点以上の得点の数は" + "個です。");
//			
//		}
		
		
			

		
	}

}
