package algorithm.level1;

/**
 * <���� ����>
 * ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. �������
 * n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.
 * 
 * <���� ����>
 * n�� ���� 10,000������ �ڿ����Դϴ�.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Soluation_12922 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int n = 3;
		String answer = "";
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer += "��";
			} else {
				answer += "��";
			}
		}

		System.out.println(answer);
	}
}
