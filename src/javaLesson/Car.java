package javaLesson;

public class Car {
	//変数の定義
	String maker;
	int year;
		
	//デフォルトコンストラクタ
	public Car() {
		this.maker = "スバル";
		this.year = 2025;
	}
	
	//引数付きコンストラクタ
	public Car(String maker,int year) {
		this.maker = maker;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("メーカーは" + maker + "です。年数は" + year + "年です。");		
	}
		
	
}
	

