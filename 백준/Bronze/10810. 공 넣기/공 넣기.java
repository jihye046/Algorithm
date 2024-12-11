import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 바구니 개수
		int M = scanner.nextInt(); // 넣고자 하는 공의 번호
		int startBasket = 0;
		int endBasket = 0;
		int ballNum = 0;
		int[] basket = new int[N];
		for(int i = 0; i < M; i++) {
			startBasket = scanner.nextInt(); // 1
			endBasket = scanner.nextInt(); // 2
			ballNum = scanner.nextInt(); // 3
			for(int j = startBasket-1; j < endBasket; j++) {
				basket[j] = ballNum;
			}
		}
		    
		for(int z : basket) {
			System.out.print(z + " ");
		}
		
		scanner.close();
	}
}