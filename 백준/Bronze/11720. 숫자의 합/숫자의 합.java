import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 몇 개의 정수를 입력받을지
		int num = Integer.parseInt(br.readLine());
		
		// 문자열 형태의 정수를 입력받음
		String input = br.readLine();
		
		// 문자열 형태의 정수를 한개씩 쪼갠 후 정수로 변환( - '0' 사용)
		int sum = 0;
		for(int i = 0; i < num; i++) {
			int digit = input.charAt(i) - '0';
			sum += digit;;
		}
		
		System.out.println(sum);
		
	}
}