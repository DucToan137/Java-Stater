package Chapter7;

public class Demo_SuperKeyword {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("123", "Eric", 10, 0.1, "java");
		st1.getMoney();
		st1.info(); // gọi hàm info của lớp con
		System.out.println("st1 check = " + st1.get_language());
		System.out.println("s1 check = " + st1._id);

		SinhVienCoKhi st2 = new SinhVienCoKhi("234", "Tom", 15, 0.1, "java");
	}
}
