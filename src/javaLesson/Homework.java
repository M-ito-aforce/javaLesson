package javaLesson;

import java.util.HashMap;
import java.util.Map;

public class Homework {
	public static void main(String [] args) { 
		Map<String,Integer> fruitsMap= new HashMap<>();
		fruitsMap.put("りんご",100);
		fruitsMap.put("みかん",80);
		fruitsMap.put("バナナ",120);
		fruitsMap.put("いちご",300);
		
		String key="りんご";
		int value;
		
		if (key == "りんご") {
			value = fruitsMap.get(key);
			System.out.println(value + "円");
		}else if (key == "みかん") {
			value = fruitsMap.get(key);
			System.out.println(value + "円");
		}else if (key == "バナナ") {
			value = fruitsMap.get(key);
			System.out.println(value + "円");
		}else if (key == "いちご") {
			value = fruitsMap.get(key);
			System.out.println(value + "円");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
	}
}
