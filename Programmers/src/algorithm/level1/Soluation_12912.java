package algorithm.level1;

/**
 * <���� ����>
 * �� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
 * ���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
 * 
 * <���� ����>
 * a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
 * a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�. a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Soluation_12912 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		System.out.println("Soluation 12912");
		int a = 3;
		int b = 5;
		long answer = 0;

		if (a >= b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}
		System.out.println(answer);

	}
}
