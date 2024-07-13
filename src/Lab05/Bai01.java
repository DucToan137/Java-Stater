package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);

		double res = 0;

		while (true) {
			System.out.println("Nhap so thuc: ");
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine(); // bỏ qua enter

			System.out.println("Nhap them (Y/N)");
			String choice = scanner.nextLine();

			if (choice.equals("N") || choice.equals("n")) {
				break;
			}
		}

		System.out.println(list.toString());

		for (int i = 0; i < list.size(); ++i) {
			// System.out.println(list.get(i)); //
			res += list.get(i);
		}

		System.out.println("sum array = " + res);
		scanner.close();
	}
}
