package Chapter7;

public class SinhVienIT extends SinhVien {
	private String _language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this._language = language;
	}

	public String get_language() {
		return _language;
	}

	public void set_language(String _language) {
		this._language = _language;
	}

	public void getMoney() {
		System.out.println("run get money");
		super.info(); // luôn gọi hàm info của lớp cha
		// this.info(); // chạy hàm info của lớp con
	}

	public void info() {
		System.out.println("run info from SinhVienIT");
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
