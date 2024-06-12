package Lab02;

import java.util.Scanner;

//Viết chương trình tính số tiền điện (in kết quả ra console)
//Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//
//Gợi ý:
//- Nếu số điện <= 100 => số tiền = số điện x 1000
//- Nếu số điện > 100
//=> số tiền = 100 * 1000 + (số điện - 100) * 1500

public class Bai03 {
	public static void main(String[] args) {
		int sodien = 0;
		int sotien = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chuong trinh tinh so tien dien");

		System.out.println("Nhap so dien: ");
		sodien = scanner.nextInt();

		if (sodien >= 0 && sodien <= 100) {
			sotien = 1000 * sodien;
		} else {
			sotien = 1000 * 100 + (sodien - 100) * 1500;
		}

		System.out.println("So tien dien: " + sotien);

		scanner.close();
	}
}
