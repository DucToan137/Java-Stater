package Chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BabyDog1 extends Dog {
	void eat() {
		System.out.println("BabyDog is eating...");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating...");
	}
}

public class Demo_Polymorphism {
	public static void main(String[] args) {
		Animal a = new BabyDog1();
		Animal b = new Cat();
		a.eat(); // đối tượng BabyDog được tự động đoán kiệu => compiler biết phải gọi method nào
		b.eat();

		// List => ArrayList/hashmap/map

	}
}
