package jp.co.aforce.practice;

public class PracticeTest5 {
	public static void main (String[] args) {
		int r = new java.util.Random().nextInt();
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("吉です");
		case 2:
			System.out.println("中吉です");	
		case 3:
			System.out.println("大吉です");
		default:
			System.out.println("凶です");
		}
	}

}
