package q02_advanced.question02;

public class ConsoleReader {

	private java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public String inputString() throws java.io.IOException {
		return br.readLine();
	}

	public int inputNumber() throws java.io.IOException {
		return Integer.parseInt(br.readLine());
	}
}
