package Lab03;

import java.util.Scanner;

// Viết bảng cửu chương của 1 số nguyên bất kỳ

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen n: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d x %d = %d", n, i, n * i);
			System.out.println();
		}

		scanner.close();

	}
}
