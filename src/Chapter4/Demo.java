package Chapter4;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Run Demo");

		// Tạo và sử dụng Object
		// khai báo Object và gán giá trị
		Student st1 = new Student();

		st1.name = "Eric";
		st1.age = 25;

		System.out.println("student with name = " + st1.name + " and age = " + st1.age);
	}
}
