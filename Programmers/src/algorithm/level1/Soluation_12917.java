package algorithm.level1;

import java.util.Arrays;
import java.util.Collections;

/**
 * <���� ����>
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���. s��
 * ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
 * 
 * <���� ����>
 * str�� ���� 1 �̻��� ���ڿ��Դϴ�.
 * 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 *
 */
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
			answer += str[i];
		}
		System.out.println(answer);
	}
}
