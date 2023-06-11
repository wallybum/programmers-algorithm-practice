package algorithm.level1;

/**
 * <���� ����>
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���. ������� N =
 * 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
 * 
 * <���ѻ���> N�� ���� : 100,000,000 ������ �ڿ���
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Soluation_12931 {
	public static void main(String[] args) {
		int n = 324;
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n = n / 10;
		}
		System.out.println(sum);
	}

}
