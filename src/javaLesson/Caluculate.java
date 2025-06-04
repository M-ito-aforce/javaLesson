package javaLesson;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Caluculate {

	public static void main(String[] args) {
		//第3章問1
		int num = 10;
		System.out.println("num = " + num);
		
		//問2
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println("sum:" + sum);
		
		//問3
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println("area:" + area);

		//問4
		String name = "Java";
		
		System.out.println(name);
		
		double version = 17.0;
		
		System.out.println(version);
		
		boolean isFun = true;
		System.out.println(isFun);
		
		//問5
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("名前を入力してください");
		
		String n =scanner.nextLine();
		
		System.out.println("こんにちは," + n + "さん");
		
		//問6
		String name1 ="伊藤美優";
		int age =23;
        LocalDate birthDate = LocalDate.of(2001, 11, 9);								
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");	

        String formattedInfo = String.format("名前: %s, 年齢: %d歳, 誕生日: %s", name1, age, birthDate.format(formatter));

		
		System.out.println(formattedInfo);
		
		String name2 = "book";
		
	
		int number
		int price = 1300;
		int total =name2 * price;
		
		System.out.println("商品:" name2 + は + "価格:" + price + "なので" + + +);
		
		scanner.close();  // 最後にScannerを閉じる
	}

}
