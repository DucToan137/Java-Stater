package Lab02;

import java.util.Scanner;

//Cho phương trình ax + b = 0
//Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
//trên
//
//Gợi ý:
//- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//- Còn lại: x = -b/a => thông báo x = ?

public class Bai01 {
	public static void main(String[] args) {
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
}
