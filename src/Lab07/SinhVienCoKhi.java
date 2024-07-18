package Lab07;

public class SinhVienCoKhi extends SinhVien {
	private double _scoreCNC;
	private double _scorePLC;

	public double getScoreCNC() {
		return _scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this._scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return _scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this._scorePLC = scorePLC;
	}

	public SinhVienCoKhi() {

	}

	public SinhVienCoKhi(String id, String name, double price, double tax, double scoreCNC, double scorePLC) {
		super(id, name, price, tax);
		this._scoreCNC = scoreCNC;
		this._scorePLC = scorePLC;
	}

	double getScore() {
		return (this._scoreCNC + this._scorePLC) / 2;
	}

	void displayInfo() {
		System.out.println("Id: " + this._id);
		System.out.println("Name: " + this._name);
		System.out.println("Score: " + this.getScore());
	}
}
