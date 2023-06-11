package algorithm.level1;

import java.util.Arrays;
import java.util.Collections;

public class Soluation_12917 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String answer = "";
		String s = "Zbcdefg";

		String[] str = s.split("");

		Arrays.sort(str, Collections.reverseOrder());

		for (int i = 0, size = str.length; i < size; i++) {
			answer +=str[i];
		}
		System.out.println(answer);
	}
}
