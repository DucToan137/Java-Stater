package Lab03;

import java.util.Scanner;

// Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
// nguyên tố hay không ?

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen: ");
		int n = scanner.nextInt();

		// Solution 1
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}

		if (dem == 2) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong la so nguyen to");
		}

		// Solution 2
		int count = 0;
		for (int i = 2; i < n - 1; ++i) {
			if (n % i == 0) {
				System.out.println("Uoc so khac: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " khong la so nguyen to");
		}

		scanner.close();
	}
}
