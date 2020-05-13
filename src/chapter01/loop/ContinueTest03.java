package chapter01.loop;

public class ContinueTest03 {

	public static void main(String[] args) {
		/*
		 * while문
		 */
		int i = 0;
		while (i < 10) {
			if (i > 5) {
				continue;
			}
			System.out.println(i);
			i++; // Unreachable Code 가 됨. i > 5 부터 i++이 안됨.
		}

		/*
		 * for문
		 */
		int j = 0;
		for (; j < 10; j++) { //for문을 다 채울 필요는 없음
			if (j > 5) {
				continue;
			}
			System.out.println(j);
		}

	}

}
