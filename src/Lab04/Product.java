package Lab04;

public class Product {

	private String _name; // tên sp
	private double _price; // giá sp
	private double _tax; // thuế sp

	public Product() {
	}

	public Product(String name, double price, double tax) {
		this._name = name;
		this._price = price;
		this._tax = tax;
	}

	// Bai 02
	public Product nhapThongTin(String name, double price, double tax) {
		Product sp = new Product(name, price, tax);
		return sp;

	}

	public void xuatThongTin() {
		System.out.println("Name: " + this._name);

		System.out.println("Price: " + this._price);

		System.out.println("Tax: " + this._tax);
	}

	public double getTaxPrice() {
		double res = this._price * this._tax;
		return res;
	}

	// Bai 03
	public String getName() {
		return this._name;
	}

	public double getPrice() {
		return this._price;
	}

	public double getTax() {
		return this._tax;
	}

	public void setName(String name) {
		this._name = name;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public void setTax(double tax) {
		this._tax = tax;
	}

	public static void main(String[] args) {
		Product test = new Product();

		System.out.println("Nhap thong tin san pham 1");
		Product sp1 = test.nhapThongTin("A", 200, 0.1);

		System.out.println("Nhap thong tin san pham 2");
		Product sp2 = test.nhapThongTin("B", 150, 0.1);

		System.out.println("Thong tin san pham 1");
		sp1.xuatThongTin();
		System.out.println("tax = " + sp1.getTaxPrice());

		System.out.println("Thong tin san pham 1");
		sp2.xuatThongTin();
		System.out.println("tax = " + sp2.getTaxPrice());

	}

}
