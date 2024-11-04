import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// 완전수 판별
	public static boolean isPerfect(int num) { // 6
		List<Integer> nums = new ArrayList<>();
		int sum = 0;
		
		// 약수 찾기
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				nums.add(i);
				sum += i;
			} 
		}
		
		return num == sum; // 완전수라면 true
	}
	
	// 약수 문자열 출력
	public static String buildDivisorString(int num) {
		List<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				nums.add(i);
			}
		}
		
		StringBuilder result = new StringBuilder();
		result.append(num).append(" = ");
		for(int i = 0; i < nums.size(); i++) {
			result.append(nums.get(i));
			if(i < nums.size() - 1) {
				result.append(" + ");
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		
		while(true) {
			int num = sc.nextInt();
			if (num == -1) break;
			nums.add(num);
		}
		
		for(int num : nums) {
			if(isPerfect(num)) {
				// 완전수라면
				System.out.println(buildDivisorString(num));
			} else {
				// 완전수가 아니라면
				System.out.println(num + " is NOT perfect.");
			};
		}
		
        sc.close();
	}
}