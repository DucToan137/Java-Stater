package Lab07;

public class Main {
	public static void main(String[] args) {
		System.out.println("run main");

		SinhVien sv1 = new SinhVienIT("123", "Eric", 10, 0.1, 8, 9);
		SinhVien sv2 = new SinhVienCoKhi("234", "Ethan", 15, 0.2, 9, 10);

		System.out.println("Sinh vien 1: ");
		sv1.displayInfo();

		System.out.println("Sinh vien 2: ");
		sv2.displayInfo();

	}
}
