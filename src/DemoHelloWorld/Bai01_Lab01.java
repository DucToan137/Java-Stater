package DemoHelloWorld;

import java.util.Scanner;

//Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//In ra màn hình với định dạng:
//<tên_sinh_viên> có điểm = <điểm>
//Ví dụ: "Eric" có điểm = 9.6
//<tên sinh viên>: Eric
//<điểm> : 10

public class Bai01_Lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name: ");
		String name = scanner.nextLine();

		System.out.println("GPA: ");
		double gpa = scanner.nextDouble();

		// System.out.print("Name: " + name);
		System.out.printf(name + " co diem = %.0f", gpa);

		scanner.close();
	}
}
