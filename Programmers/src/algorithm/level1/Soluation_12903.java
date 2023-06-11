package algorithm.level1;

import java.util.stream.IntStream;

public class Soluation_12903 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String s = "abcde";
//		String s = "qwer";
		String answer = "";
		
		if(s.length() %2 == 0) {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		}else {
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		System.out.println("answer : "+answer);
	}
}