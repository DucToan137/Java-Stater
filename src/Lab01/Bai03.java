package Lab01;

import java.util.Scanner;

//Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//Tính và xuất ra thể tích của hình lập phương.

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap canh khoi lap phuong: ");
		double canh = scanner.nextDouble();

		double res = Math.pow(canh, 3);

		System.out.println("The tich: " + res);

		scanner.close();
	}
}
