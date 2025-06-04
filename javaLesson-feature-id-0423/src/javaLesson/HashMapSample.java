package javaLesson;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	
	public static void main (String[] args) {
		Map<String,Integer> nameMap = new HashMap<>();
		String key = null;
		Integer value = null;
		
		key="Bob";
		value = 1;
		nameMap.put(key,value);
		
		key="Alice";
		value = 2;
		nameMap.put(key,value);
		
		key="John";
		value = 2;
		nameMap.put(key,value);
		
		key="Tom";
		value = 1;
		nameMap.put(key,value);
		
		//nameMap.put("Alice",2);
		//nameMap.put("John",2);
		//nameMap.put("Tom",1);

		System.out.println(nameMap);
		

	
	}
}
