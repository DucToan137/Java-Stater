package Chapter6;

import java.util.ArrayList;

public class Student {
	private String _name;
	private int _id;

	@Override
	public String toString() {
		return "Student [_name=" + _name + ", _id=" + _id + "]";
	}

	public String getName() {
		return this._name;
	}

	public int getId() {
		return this._id;
	}

	public Student() {
	}

	public Student(String name, int id) {
		this._name = name;
		this._id = id;
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		Student st1 = new Student("Nguyen Van A", 1);
		Student st2 = new Student("Tran Van B", 2);
		Student st3 = new Student("Nguyen Van C", 3);
		Student st4 = new Student("Le Thi D", 4);
		Student st5 = new Student("Tran Van E", 5);

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);

		System.out.println("check arr: " + list);

		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Name: " + list.get(i).getName() + ", Id: " + list.get(i).getId());
			}
		}

	}
}
