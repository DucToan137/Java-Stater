package Chapter4;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("run Demo2");

		Student st1 = new Student();

		Student st2 = new Student("Eric", 25);
		st2.setName("Toan");

		System.out.println("check obj: " + st1.getName() + " age = " + st1.getAge());
		System.out.println("check obj: " + st2.getName() + " age = " + st2.getAge());
	}
}
