import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		int inputNum = Integer.parseInt(br.readLine()) - 1;
		char a = inputStr.charAt(inputNum);
		System.out.println(a);
	}
}