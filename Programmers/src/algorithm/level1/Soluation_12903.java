package algorithm.level1;

/**
 * <���� ����>
 * �ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * 
 * <���ѻ���>
 *  s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 *  
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class Soluation_12903 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String s = "abcde";
		String answer = "";

		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}
		System.out.println("answer : " + answer);
	}
}