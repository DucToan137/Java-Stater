package Chapter4;

public class Demo {

	int sum(int a, int b) { // k định nghĩa mặc định là public
		int res = a + b;
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Run Demo");

		// Tạo và sử dụng Object
		// khai báo Object và gán giá trị
		Student st1 = new Student();

		st1._name = "Eric";
		st1._age = 25;

		System.out.println("student with name = " + st1._name + " and age = " + st1._age);

		int a = 5;
		int b = 6;
		Demo test = new Demo();

		int res = test.sum(a, b);
		System.out.println(res);

	}
}
