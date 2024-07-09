package P3;

// TH3: kế thừa

import P1.P;

public class p3 extends P1.P {

	private void tes() {
		P firstObj = new P();
		firstObj.a = 10;
		// firstObj.b = 10; // lỗi (khác package)
		c = 10; // protected
		// sau này dùng super.c = 10;
		// firstObj.d = 10; // báo lỗi vì d là thuộc tính private
	}

	public static void main(String[] args) {
		P firstObj = new P();
		firstObj.a = 10;
		// firstObj.b = 10; // lỗi (khác package)
		// firstObj.c = 10; // protected
		// firstObj.d = 10; // báo lỗi vì d là thuộc tính private
	}
}
