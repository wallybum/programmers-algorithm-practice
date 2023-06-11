package algorithm.level1;

public class Soluation_12912 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		System.out.println("Soluation 12912");
		int a = 3;
		int b = 5;
		long answer = 0;
		
		if(a >= b) {
			for(int i=b; i <=a; i++) {
				answer +=i;
			}
		}else {
			for(int i =a; i <=b; i++) {
				answer +=i;
			}
		}
		System.out.println(answer);

	}
}
