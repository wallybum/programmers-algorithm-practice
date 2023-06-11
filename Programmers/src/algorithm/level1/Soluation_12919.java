package algorithm.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Soluation_12919 {
	public static void main(String[] args) {
		String[] seoul = new String[] {"Jane", "Kim"};
		run(seoul);
	}

	private static void run(String[] seoul) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));
		String answer = "김서방은"+list.indexOf("Kim")+"에 있다.";
	}
}
