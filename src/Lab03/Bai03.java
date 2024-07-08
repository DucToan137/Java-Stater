package Lab03;

import java.util.Arrays;
import java.util.Scanner;

//Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//- Sắp xếp và xuất mảng vừa nhập ra màn hình
//- Xuất phần tử có giá trị nhỏ nhất
//- Xuất phần tử có giá trị lớn nhất

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Nhap so phan tu mang: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap phan tu %d:", i + 1);
			a[i] = scanner.nextInt();
		}

		System.out.println("Mang ban dau:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Mang sau khi sap xep:" + Arrays.toString(a));
		System.out.println("max = " + Math.max(a[0], a[n - 1]));
		System.out.println("min = " + Math.min(a[0], a[n - 1]));

		// Solution 2
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; ++i) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);

		scanner.close();
	}

}
