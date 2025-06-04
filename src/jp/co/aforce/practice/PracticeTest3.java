package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		List <String> itemList = new ArrayList<>();
		itemList.add(0,"シャープペンシル");
		itemList.add(1,"ボールペン");
		itemList.add("リングノート");
		itemList.add("クリップ");
		itemList.add("消しゴム");
		String element1 = itemList.get(1);
		System.out.println(element1);
		List <String> nameList = new ArrayList<>();
		nameList.add("山田太郎");
		nameList.add("鈴木花子");
		nameList.add("佐藤二郎");
		nameList.add("山田太郎");
		nameList.add("高橋三郎");
		String element2 = nameList.get(2);
		System.out.println(element2);
	
		ArrayList<Integer> lists = new ArrayList<>();
			lists.add(10);
			lists.add(11);
			lists.add(12);
			lists.add(15);
			lists.add(16);
			lists.add(18);
			lists.add(19);
			lists.add(20);
				
	   for (Integer number : lists) {
		 System.out.println(number);
	   }
	
	}

}
