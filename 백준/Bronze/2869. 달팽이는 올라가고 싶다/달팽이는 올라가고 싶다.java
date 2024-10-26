import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 낮에 올라가는 거리
		int B = sc.nextInt(); // 밤에 미끄러지는 거리
		int V = sc.nextInt(); // 나무막대 길이
		
		// (마지막날까지 와야할 최소거리 / 최소거리를 몇일에 걸쳐 오는지 계산) + 마지막 날 하루
		int day = (int)Math.ceil((V-A) / (double)(A-B)) + 1;
		System.out.println(day);
		
        sc.close();
	}
}