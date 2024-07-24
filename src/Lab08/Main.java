package Lab08;

public class Main {
	public static void main(String[] args) {
		System.out.println("run lab08");

		Student st2 = new Student("a", "Eric", 19, 4);
		st2.setGrade();
		System.out.println(st2);
		System.out.println(st2.toString());

		Person p1 = new Person("123", "Hary", 20);
		System.out.println(p1.toString());

	}
}
