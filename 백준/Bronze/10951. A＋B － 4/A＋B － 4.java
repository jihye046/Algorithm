import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		boolean end = true;
		
		while(end) {
			try {
				String[] input = scanner.nextLine().split(" ");
				int A = Integer.parseInt(input[0]);
				int B = Integer.parseInt(input[1]);
				sb.append(A + B + "\n");
			} catch(Exception e) {
				end = false;
				break;
			}
		}
		
		System.out.println(sb.toString());
		
		scanner.close();
	}
}