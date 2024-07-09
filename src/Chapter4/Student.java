package Chapter4;

public class Student {

	// class attributes
	String _name;
	int _age;

	// class method
	void learnJava() {
		System.out.println("Learn Java");
	}

	// constructor
	Student() { // k định nghĩa mặc định là public

	}

	public Student(String name, int age) {
		this._age = age;
		this._name = name;
	}

}
