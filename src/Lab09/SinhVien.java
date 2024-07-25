package Lab09;

import java.util.Scanner;

public class SinhVien {
	private String _masv;
	private String _hoten;
	private double _diem;
	private int _age;

	public String Masv() {
		return _masv;
	}

	public void setMasv(String _masv) {
		this._masv = _masv;
	}

	public String Hoten() {
		return _hoten;
	}

	public void setHoten(String _hoten) {
		this._hoten = _hoten;
	}

	public double Diem() {
		return _diem;
	}

	public void setDiem(double _diem) {
		this._diem = _diem;
	}

	public int getAge() {
		return _age;
	}

	public void Age(int _age) {
		this._age = _age;
	}

	public SinhVien() {

	}

	public SinhVien(String masv, String hoten, double diem, int age) {
		this._masv = masv;
		this._hoten = hoten;
		this._diem = diem;
		this._age = age;
	}

	public SinhVien input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap masv: ");
		String masv = scanner.nextLine();
		System.out.println("Nhap ho ten: ");
		String hoten = scanner.nextLine();

		double diem = 0;
		int age = 0;

		while (true) {
			System.out.println("Nhap diem: ");
			try {

				diem = scanner.nextDouble();
				if (diem > 0 && diem < 10) {
					break;

				} else {
					System.out.println("Diem khong hop le. Vui long nhap lai");
				}
			} catch (Exception e) {
				System.out.println("Diem khong dung dinh dang. Vui long nhap lai");
				scanner.next();
			}
		}

		while (true) {
			System.out.println("Nhap tuoi: ");
			try {
				age = scanner.nextInt();
				if (age > 18 && age < 100) {
					break;
				} else {
					System.out.println("Tuoi khong hop le. Vui long nhap lai");
				}
			} catch (Exception e) {
				System.out.println("Tuoi khong dung dinh dang. Vui long nhap lai");
				scanner.next();
			}
		}
		SinhVien sv = new SinhVien(masv, hoten, diem, age);
		return sv;

	}

	@Override
	public String toString() {
		return "SinhVien [_masv=" + _masv + ", _hoten=" + _hoten + ", _diem=" + _diem + ", _age=" + _age + "]";
	}

}
