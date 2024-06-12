package Lab02;

import java.util.Scanner;

//Cho phương trình: ax^2 + bx + c = 0
//Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//trên
//Gợi ý:
//- Nếu a = 0 => làm tương tự ví dụ bài 1
//- Nếu a # 0:
//- Tính delta = b^2 - 4ac.
//- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//x1 = (-b + căn(delta))/(2*a)
//x2 = (-b - căn(delta))/(2*a)

public class Bai02 {
	public static void main(String[] args) {

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
}
