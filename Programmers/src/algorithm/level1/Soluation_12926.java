package algorithm.level1;

/**
 * <���� ����> 
 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ���
 * False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��,
 * ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 * 
 * ���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.
 * 
 * <���ѻ���>
 * ���ڿ� s�� ���� : 50 ������ �ڿ��� ���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class Soluation_12926 {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		String answer = "";
		String s = "CD";
		int num = 1;
		for (int i = 0; i < s.length(); i++) {
			char alphabet = s.charAt(i);

			if (Character.isLowerCase(alphabet)) {
				alphabet = (char) ((alphabet - 'a' + num) % 26 + 'a');
			} else if (Character.isUpperCase(alphabet)) {
				alphabet = (char) ((alphabet - 'A' + num) % 26 + 'A');
			}
			answer += alphabet;
		}
		System.out.println(answer);

	}
}
