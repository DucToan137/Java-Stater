package Lab09;

public class Main {

	public static void main(String[] args) {
		System.out.println("run main");

		SinhVien sv1 = new SinhVien();
		sv1 = sv1.input();

		System.out.println(sv1.toString());
	}
}
