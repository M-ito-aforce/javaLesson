package jp.co.aforce.sample;
import java.util.Scanner;

public class ExceptionQuesution {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		String number = scanner.nextLine();
		try {
			int numberInt = Integer.parseInt(number);
			int result = numberInt / 2;
			System.out.println("結果:" + result);
		}catch (NumberFormatException e) {
			System.out.println("整数で入力してください");
		}

		scanner.close();
	}

}
