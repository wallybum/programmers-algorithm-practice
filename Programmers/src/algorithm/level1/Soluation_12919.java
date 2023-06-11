package algorithm.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <���� ����>
 * String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ�
 * �Լ�, solution�� �ϼ��ϼ���. 
 * 
 * seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * 
 * <���� ����>
 * seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�. seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
 * "Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class Soluation_12919 {
	public static void main(String[] args) {
		String[] seoul = new String[] { "Jane", "Kim" };
		run(seoul);
	}

	private static void run(String[] seoul) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));
		String answer = "�輭����" + list.indexOf("Kim") + "�� �ִ�.";
		System.out.println(answer);
	}
}
