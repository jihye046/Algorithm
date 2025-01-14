import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num-i; j++) {
				sb.append(" ");
			}
			for(int z = 1; z <= i; z++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		scanner.close();
	}
}