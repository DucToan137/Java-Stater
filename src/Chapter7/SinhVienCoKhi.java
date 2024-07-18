package Chapter7;

public class SinhVienCoKhi extends SinhVien {
	private String _skill;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this._skill = skill;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
