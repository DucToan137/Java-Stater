package DemoHelloWorld;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// khai bao can gan gia tri
		String[] clubs = { "MU", "MC", "Bayern" };
		clubs[0] = "Arsenal";

		String[] a = new String[5]; // cac phan tu chua khoi tao mang gia tri null
		a[0] = "hehe";

		System.out.println("Length: " + clubs.length); // chieu dai mang
		System.out.println(Arrays.toString(clubs));

		// Duyet tat ca phan tu cua mang
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars1) {
			System.out.println(i);
		}
	}
}
