package Lab07;

public abstract class SinhVien {
	protected String _id;
	protected String _name;
	protected double _price;
	protected double _tax;

	abstract double getScore();

	abstract void displayInfo();

	public SinhVien() {

	}

	public SinhVien(String id, String name, double price, double tax) {
		super();
		this._id = id;
		this._name = name;
		this._price = price;
		this._tax = tax;
	}

}
