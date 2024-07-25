package Chapter9;

import java.util.Scanner;

public class Demo_Finally {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);

		/*try {
			int x = scanner.nextInt();
			System.out.println("run try");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("run catch");
		} finally {
			System.out.println("run finally");
			scanner.close();
		}*/
		
		
		try(Scanner scanner = new Scanner(System.in);){
			int x = scanner.nextInt();
		}
		
	}
}
