package Chapter6;

import java.util.Scanner;

// Nhập username và password từ bàn phím. Nếu username = "hoidanit" và
// password > 6 ký tự thì hợp lệ

public class Demo1_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap username: ");
		String username = scanner.nextLine();

		// scanner.nextLine();

		System.out.println("Nhap password: ");
		String pass = scanner.nextLine();

		System.out.println("username = " + username + ", password = " + pass);

		if (!username.equals("hoidanit") && pass.length() <= 6) {
			System.out.println("Khong hop le");
		} else {
			System.out.println("Valid input");
		}

		scanner.close();
	}
}
