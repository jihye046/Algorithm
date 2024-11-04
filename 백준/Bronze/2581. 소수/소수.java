import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// 소수인지 아닌지 판별
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) return false; 
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // 60이상
		int N = sc.nextInt(); // 100이하
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) list.add(i);
		}

		if(list.isEmpty()) {
			System.out.println("-1");
		} else {
			int sum = 0;
			for(int a : list) {
				sum += a;
			}
			System.out.println(sum); // 소수 합계
			
			Collections.sort(list);
			System.out.println(list.get(0)); // 소수 최솟값
		}
		
        sc.close();
	}
}