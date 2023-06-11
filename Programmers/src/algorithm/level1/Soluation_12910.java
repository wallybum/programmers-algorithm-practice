package algorithm.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <���� ����> 
 * array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�,
 * solution�� �ۼ����ּ���. 
 * 
 * divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
 * 
 * <���ѻ���> 
 * arr�� �ڿ����� ���� �迭�Դϴ�. ���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�. divisor��
 * �ڿ����Դϴ�. array�� ���� 1 �̻��� �迭�Դϴ�.
 *
 */
public class Soluation_12910 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int[] arr = { 3, 2, 6 };
		int divisor = 10;
		List<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer.add(arr[i]);
			}

			Collections.sort(answer);
		}
		if (answer.isEmpty()) {
			answer.add(-1);
		}
		System.out.println(answer);

	}
}
