import java.util.ArrayList;
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
		
		int N = sc.nextInt(); 
		sc.nextLine();
		
		String input = sc.nextLine();
		String[] nums = input.split(" ");
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			int num = Integer.parseInt(nums[i]);
			boolean result = isPrime(num);
			if(result) list.add(num);
		}
		
		// 소수의 개수를 출력
		System.out.println(list.size());
		
        sc.close();
	}
}