package javaLesson;

public class CarCall {
	public static void main (String [] args) {
		//デフォルトコンストラクタ
		Car car = new Car();
		//引数付きコンストラクタ
		Car kuruma = new Car("トヨタ",2025);
		car.displayInfo();
		kuruma.displayInfo();
	}

}
