package Chapter8;

public class Demo_Interface {
	public static void main(String[] args) {
		System.out.println("run demo");

		// IAnimal a = new IAnimal(); // interface k có hàm tạo

		Pig test = new Pig();
		test.animalSound();
	}
}
