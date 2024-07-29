package Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_ReadWriteFile {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			// relative path . ..//linux
			in = new FileInputStream("./src/Chapter10/input.txt");

			// absolute path
			out = new FileOutputStream("outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("END");
		}
	}
}
