package javaLesson;

public class Animal1 {
	void speak () {
		System.out.println("Some sound");
	}
}

class Dog extends Animal{
	void speak() {
		System.out.println("Woof!");
	
	}
}

		public class Main{
			public static void main(String[] args) {
				Animal a = new Dog();
				a.speak();
			}
				
		}

