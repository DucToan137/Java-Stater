package Basic;

import java.util.Scanner;

//Viết chương trình lựa chọn chức năng
//System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//System.out.println("++ ------------------ ++");
//System.out.println("| 1. Cộng |");
//System.out.println("| 2. Trừ |");
//System.out.println("| 3. Kết thúc |");
//System.out.println("++ ------------------ ++");
//Scanner scanner = new Scanner(System.in);
//System.out.println("Lựa chọn của bạn là : ");
//Yêu cầu:
//Nếu nhập vào 1 => in ra "Bạn đã lựa chọn phép cộng"
//Nếu nhập vào 2 => in ra "Bạn đã lựa chọn phép trừ"
//Nếu nhập vào 3 => in ra "Bạn đã lựa chọn thoát chương trình" => System.exit(0);

public class Java_Switch {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là : ");

		int choice = 0;
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Ban da lua chon phep cong");
			break;
		case 2:
			System.out.println("Ban da lua chon phep tru");
			break;
		default:
			System.out.println("Ban da lua chon thoat chuong trinh");
			System.exit(0); // lenh thoat chuong trinh
		}

		scanner.close();

	}
}
