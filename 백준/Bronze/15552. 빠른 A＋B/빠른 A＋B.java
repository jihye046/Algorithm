import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T; i++) {
			String[] input = scanner.nextLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			sb.append(A + B).append("\n");
		}
		System.out.println(sb.toString());
		
		scanner.close();
	}
}