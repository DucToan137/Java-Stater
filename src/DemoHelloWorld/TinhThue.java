package DemoHelloWorld;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//- dưới 10M: không đóng thuế
//- từ 10M tới 15M: thuế 10%
//- từ 15 tới 30M : thuế 20%
//- trên 30M: thuế 50%
//Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"

public class TinhThue {
	public static void main(String[] args) {
		int tax = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao tax = ");
		tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("Khong dong thue");
		} else if (tax >= 10 && tax < 15) {
			System.out.println("Thue 10%");
		} else if (tax >= 15 && tax < 30) {
			System.out.println("Thue 20%");
		} else {
			System.out.println("Thue 50%");
		}

		scanner.close();
	}
}
