package Lab07;

public class SinhVienIT extends SinhVien {
	private double _scoreHTML;
	private double _scoreJava;

	double getScore() {
		return (this._scoreJava * 2 + this._scoreJava) / 3;
	}

	public SinhVienIT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienIT(String id, String name, double price, double tax, double scoreJava, double scoreHTML) {
		super(id, name, price, tax);
		this._scoreHTML = scoreHTML;
		this._scoreJava = scoreJava;
	}

	void displayInfo() {
		System.out.println("Id: " + this._id);
		System.out.println("Name: " + this._name);
		System.out.println("Score: " + this.getScore());
	}

}
