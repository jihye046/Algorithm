import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		boolean result = true;
		
		while(result) {
			String[] input = scanner.nextLine().split(" ");
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			if(A != 0 && B != 0) {
				sb.append(A + B + "\n");
			} else {
				break;
			}
			
		}
		
		System.out.println(sb.toString());	
		scanner.close();
	}
}