package algorithm.level1;

/**
 * <���� ����>
 * �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]��
 * �����մϴ�.
 * 
 * <���� ����>
 * n�� 10,000,000,000������ �ڿ����Դϴ�.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Soluation_12932 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		long n = 12345;

		System.out.println((int) Math.log10(n + 1)); // 4
		System.out.println(n % 10 ^ (int) Math.log10(n + 1));

	}
}
