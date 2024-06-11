package DemoHelloWorld;

import java.util.Scanner;

//Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//Tính toán và in ra console:
//- chu vi hình chữ nhật
//- diện tích hình chữ nhật
//- cạnh nhỏ nhất của hình chữ nhật

public class Bai02_Lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap chieu dai: ");
		double d = scanner.nextDouble();

		System.out.println("Nhap chieu rong: ");
		double r = scanner.nextDouble();

		double cv = (d + r) * 2;
		double dt = d * r;

		double min = Math.min(d, r);

		System.out.println("Chu vi: " + cv);
		System.out.println("Dien tich: " + dt);
		System.out.println("Canh nho nhat: " + min);

		scanner.close();
	}
}
