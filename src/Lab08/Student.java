package Lab08;

public class Student extends Person {
	private int _mark;
	private String _grade;

	public int Mark() {
		return this._mark;
	}

	public void setMark(int mark) {
		this._mark = mark;
	}

	public String Grade() {
		return this._grade;
	}

	public void setGrade() {
		if (Mark() >= 8) {
			this._grade = "A";
		} else if (Mark() >= 7) {
			this._grade = "B";
		} else if (Mark() >= 6) {
			this._grade = "C";
		} else if (Mark() >= 5) {
			this._grade = "D";
		} else {
			this._grade = "Tach cmnr";
		}
	}

	Student() {

	}

	Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this._mark = mark;
		setGrade();
	}

	@Override
	public String toString() {
		return "Student [_mark=" + _mark + ", _grade=" + _grade + "]";
	}

}
