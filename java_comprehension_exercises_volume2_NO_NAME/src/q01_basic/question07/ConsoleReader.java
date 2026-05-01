package q01_basic.question07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = br.readLine();
			int limit = Integer.parseInt(line);
			return limit;

		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
