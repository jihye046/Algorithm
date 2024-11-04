import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] nums = new int[N][2];
		// 입력받은 수 배열에 담기
		for(int i = 0; i < N; i++) {
			String[] a = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				nums[i][j] = Integer.parseInt(a[j]);
			}
		}
		
		// 배열 정렬
		Arrays.sort(nums, (a, b) -> {
		    if (a[0] == b[0]) {
		        return a[1] - b[1]; // y 좌표를 기준으로 오름차순 정렬
		    } else {
		        return a[0] - b[0]; // y 좌표가 같으면 x 좌표를 기준으로 오름차순 정렬
		    }
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(nums[i][0] + " " + nums[i][1]).append("\n");
		}
		System.out.println(sb.toString());
		
	}
}