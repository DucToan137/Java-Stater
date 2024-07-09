package P2;

// TH2: khác package

import P1.P;

public class p2 {
	public static void main(String[] args) {
		P firstObj = new P();
		firstObj.a = 10;
		// firstObj.b = 10; // lỗi (khác package)
		// firstObj.c = 10; // lỗi (khác package)
		// firstObj.d = 10; // báo lỗi vì d là thuộc tính private
	}
}
