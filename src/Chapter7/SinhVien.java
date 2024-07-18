package Chapter7;

public abstract class SinhVien {
	protected String _id;
	protected String _name;
	protected double _price;
	protected double _tax;

	abstract void tinhDiem();

	public SinhVien(String _id, String _name, double _price, double _tax) {
		super();
		this._id = _id;
		this._name = _name;
		this._price = _price;
		this._tax = _tax;
	}

	public double getPriceTax() {
		return this._tax * this._price;
	}

	public void info() {
		System.out.println("run info from parent");
	}
}
