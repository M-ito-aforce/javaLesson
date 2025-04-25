package javaLesson;

public class Person3 {
	//変数の定義
	String name;
	int age;
	
	//コンストラクタの定義
	public Person3(String name,int age){
		//「変数の定義」で定義したnameとageフィールドを初期化
		this.name = name;
		this.age = age;
	}
	
	//メソッド
	public void displayInfo() {
		//名前と年齢を表示
		System.out.println("名前は" + name + "です。年齢は" + age + "歳です。");
	}

}
