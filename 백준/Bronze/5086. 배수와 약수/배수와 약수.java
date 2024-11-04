import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// 케이스 판별
	public static String determineRelation(int num1, int num2) {
		if(num2 % num1 == 0) {
			return "factor";
		} else if(num1 % num2 == 0) {
			return "multiple";
		} else {
			return "neither";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0) {
				break;
			}
			list.add(determineRelation(num1, num2)); 	
		}
		
		for(String result : list) {
			System.out.println(result);
		}
		
        sc.close();
	}
}