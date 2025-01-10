import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int[] dices = new int[3];
		int reward = 0;
		for(int i = 0; i < dices.length; i++) {
			dices[i] = scanner.nextInt();
		}
		Arrays.sort(dices);
		if(dices[0] == dices[1] && dices[1] == dices[2]) {
			reward = 10000 + dices[0] * 1000;
		} else if(dices[0] == dices[1] || dices[1] == dices[2]) {
			reward = 1000 + dices[1] * 100;
		} else {
			reward = dices[2] * 100;
		}
		
		System.out.println(reward);
	}
}