import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] x = new int[3]; // 5, 5, 5
		int[] y = new int[3]; // 5, 7, 5
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int resultX = 0;
		int resultY = 0;
		
		if(x[0] == x[1]) {
			resultX = x[2];
		} else if(x[1] == x[2]) {
			resultX = x[0];
		} else if(x[2] == x[0]) {
			resultX = x[1];
		}
		
		if(y[0] == y[1]) {
			resultY = y[2];
		} else if(y[1] == y[2]) {
			resultY = y[0];
		} else if(y[2] == y[0]) {
			resultY = y[1];
		}
		
		System.out.println(resultX + " " + resultY);
		
		sc.close();
	}
}