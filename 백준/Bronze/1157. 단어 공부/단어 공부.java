import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String input = sc.next().toUpperCase();
		
		for(int i = 0; i < input.length(); i++) {
			arr[input.charAt(i) - 'A']++;
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i< 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 'A');
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		
		sc.close();
	}
}