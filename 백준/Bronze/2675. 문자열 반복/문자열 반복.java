import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");
			
			int num = Integer.parseInt(str[0]);
			String eng = str[1];
			
			for(int j = 0; j < eng.length(); j++) {
				for(int z = 0; z < num; z++) {
					System.out.print(eng.charAt(j));
				}
			}
			System.out.println();
		}
	}

}