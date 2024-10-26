import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double totalCredits = 0;     // 총 학점
		double totalGradePoints = 0; // 총 학점 * 성적 점수
		
		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		for(int i = 0; i < 20; i++) {
			String subject = sc.next(); // 과목
			double credits = sc.nextDouble(); // 학점
			String grade = sc.next(); // 성적
			
			if(map.containsKey(grade)) {
	            totalCredits += credits;
	            totalGradePoints += credits * map.get(grade);
			}
		}
		
		// 전공평점
        double result = totalGradePoints / totalCredits;
        System.out.printf("%.6f", result);
        
        sc.close();
	}
}