package Lab08;

public class Person implements IPerson {
	protected String _id;
	protected String _name;
	protected int _age;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	Person() {

	}

	Person(String id, String name, int age) {
		this._id = id;
		this._name = name;
		this._age = age;
	}

	@Override // annotation === comment
	public void input() {

	}

	public void display() {

	}

	@Override
	public String toString() {
		return "Person [_id=" + _id + ", _name=" + _name + ", _age=" + _age + "]";
	}

}
