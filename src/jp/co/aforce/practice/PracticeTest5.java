package jp.co.aforce.practice;

public class PracticeTest5 {
	public static void main (String[] args) {
		int r = new java.util.Random().nextInt(3)+1;
		String str = "";
		switch(r) {
			case 1:
				str = "吉です";
				break;
			case 2:
				str = "中吉です";
				break;
			case 3:
				str = "大吉です";
				break;
			default:
				str = "凶です";
				break;
		}
		System.out.println(str);
	}
	
}
