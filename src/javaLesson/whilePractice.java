package javaLesson;

import java.util.ArrayList;

public class whilePractice {
	public static void main (String [] args) {
		int i= 5;
		
		while (i < 5) {
			System.out.println("iの値:" + i );
			i ++ ;
		}
		
		i=0;
		do {
			System.out.println("iの値:" + i);
			i++;
		}while (i < 5);
		
		System.out.println("iの値:" + i);
		
		
	
		for(int m = 1; m<= 10; m++ ) {
			System.out.println("mの値" + m );
			for(int n = 5; n<= 10;n++) {
				System.out.println("nの値" + n);
			}
		}
		
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");
		
		for(String employee : employees ){
			System.out.println(employee);
		}
		
	}
}	