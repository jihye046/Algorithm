import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int totalPrice = Integer.parseInt(scanner.nextLine());
		int totalKind = Integer.parseInt(scanner.nextLine());
		int calculation = 0;
		
		for(int i = 0; i < totalKind; i++) {
			String[] list = scanner.nextLine().split(" ");
			int A = Integer.parseInt(list[0]);
			int B = Integer.parseInt(list[1]);
			calculation += A * B;
		}
		
		if(totalPrice == calculation) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
	}
}