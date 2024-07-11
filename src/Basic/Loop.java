package Basic;

public class Loop {
	public static void main(String[] args) {
		// For
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// While
		System.out.println("=============");
		int i = 0;
		while (i < 6) {
			System.out.println(i);
			i++;
		}

		// Do...while
		System.out.println("=============");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k < 5);

		// Break
		System.out.println("============");
		for (int j = 0; j < 5; j++) {
			System.out.println(j);
			if (j == 3) {
				break; // thoat khoi vong lap
			}
		}

		// Continue
		System.out.println("============");
		for (int j = 0; j < 5; j++) {
			if (j == 3) {
				continue; // thoat khoi lan lap
			}
			System.out.println(j);

		}
	}
}
