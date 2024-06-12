package Lab02;

import java.util.Scanner;

//Viết chương trình tổ chức menu:
//System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
//System.out.println("++ ----------------------------------------- ++");
//System.out.println("| 1. Giải phương trình bậc nhất |");
//System.out.println("| 2. Giải phương trình bậc hai |");
//System.out.println("| 3. Tính số tiền điện |");
//System.out.println("| 4. Kết thúc |");
//System.out.println("++ ------------------ ++");
//Yêu cầu:
//- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

public class Bai04 {

	public static void GiaiPTBacNhat() {
		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int b = 0;
		double x = 0;

		System.out.println("Chuong trinh giai phuong trinh bac nhat");

		System.out.println("Nhap a: ");
		a = scanner.nextInt();

		System.out.println("Nhap b: ");
		b = scanner.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			x = (double) -b / a;
			System.out.printf("Nghiem cua phuong trinh x = %.3f", x);
		}

		scanner.close();
	}

	public static void GiaiPTBacHai() {
		int a = 0;
		int b = 0;
		int c = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chuong trinh gia phuong trinh bac 2");

		System.out.println("Nhap a: ");
		a = scanner.nextInt();

		System.out.println("Nhap b: ");
		b = scanner.nextInt();

		System.out.println("Nhap c: ");
		c = scanner.nextInt();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				double x = (double) -c / b;
				System.out.printf("Nghiem cua phuong trinh x = %.3f", x);
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = (double) -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x = " + x);
			} else {
				double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (double) (b + Math.sqrt(delta)) / (2 * a);

				System.out.println("Phuong trinh co 2 nghiem phan biet");
				System.out.printf("x1 = %.3f", x1);
				System.out.printf("x2 = %.3f", x2);

			}
		}

		scanner.close();
	}

	public static void TinhTienDien() {
		int sodien = 0;
		int sotien = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chuong trinh tinh so tien dien");

		System.out.println("Nhap so dien: ");
		sodien = scanner.nextInt();

		if (sodien >= 0 && sodien <= 100) {
			sotien = 1000 * sodien;
		} else {
			sotien = 1000 * 100 + (sodien - 100) * 1500;
		}

		System.out.println("So tien dien: " + sotien);

		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">> LUA CHON TINH NANG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Gia phuong trinh bac nhat |");
		System.out.println("| 2. Giai phuong trinh bac hai |");
		System.out.println("| 3. Tinh so tien dien |");
		System.out.println("| 4. Ket thuc |");
		System.out.println("++ ------------------ ++");

		int choice = 0;

		System.out.println("Nhap lua chon: ");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// Lab02.Bai01.main(null);
			GiaiPTBacNhat();
			break;
		case 2:
			// Lab02.Bai02.main(null);
			GiaiPTBacHai();
			break;
		case 3:
			// Lab02.Bai03.main(null);
			TinhTienDien();
			break;
		default:
			System.out.println("Thoat chuong trinh");
			System.exit(0);
		}

		scanner.close();
	}
}
