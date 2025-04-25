package javaLesson;

public class PersonTest {
	public static void main (String[] args) {
		//nameにMiyu、ageに２３を設定してpersonクラスのp部ジェクトを生成
		Person2 person = new Person2("Miyu",23);
		//PersonクラスのdisplayInfoメソッドを呼び出している
		person.displayInfo();
	}

}
