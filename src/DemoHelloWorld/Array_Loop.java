package DemoHelloWorld;

import java.util.Arrays;

public class Array_Loop {
	public static void main(String[] args) {
		String[] clubs = { "MU", "MC", "Bayern" };
		System.out.println(clubs);
		System.out.println(Arrays.toString(clubs));

		int[] arr = { 5, 6, 2, 9 };
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		int[] arr1 = { 5, 6, 2, 9, 7, 8 };

		// sắp xếp tăng dần
		for (int i = 0; i < arr1.length - 1; ++i) {
			for (int j = i + 1; j < arr1.length; ++j) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr1));

	}
}
