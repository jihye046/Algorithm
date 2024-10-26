import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int change = sc.nextInt(); // 124
			
			int a = change / QUARTER; // 4
			change = change % QUARTER; // 24
			
			int b = change / DIME; // 2
			change = change % DIME; // 4
			
			int c = change / NICKEL; // 0
			change = change % NICKEL; // 5
			
			int d = change / PENNY; // 5
			System.out.println(a + " " + b + " " + c + " " + d);
		}
		
        sc.close();
	}
}