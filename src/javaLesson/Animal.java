package javaLesson;

public class Animal {
	 public void makeSound() {
		 System.out.println("動物の鳴き声");
	        
	 }
	public static void main (String [] args) { 
		Animal animal = new Animal();
		animal.makeSound();
		Dog animal2 = new Dog();
		animal2.makeSound();
		Cat cat = new Cat();
		cat.makeSound();
		
    
	}
	
}
