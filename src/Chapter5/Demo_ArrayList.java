package Chapter5;

import java.util.ArrayList;

public class Demo_ArrayList {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a1 = new ArrayList(); // Không khai báo kiểu dữ liệu => Hạn chế sử dụng
		a1.add(2); // integer => Integer (autoboxing/unboxing)
		a1.add("demo"); // String

		System.out.println(a1.toString() + " " + a1.size());

		ArrayList<Integer> a2 = new ArrayList<Integer>(); // generic
		a2.add(2);
		// a2.add("demo"); // báo lỗi

	}
}
