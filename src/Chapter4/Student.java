package Chapter4;

public class Student {

	// class attributes
	private String _name;
	private int _age;

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

	public String getName() {
		return this._name;
	}

	public int getAge() {
		return this._age;
	}

	public void setName(String name) {
		this._name = name;
	}

	public void setAge(int age) {
		this._age = age;
	}

}
