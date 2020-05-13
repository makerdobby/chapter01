package chapter01.loop;

import java.util.Scanner;

public class InfiniteLoopTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int value;
		while(true) { //for문은 for(;;) 이렇게
			System.out.print("숫자입력[ -1 to quit]> ");
			value = scanner.nextInt();

			if (value == -1) {
				break;
			}
			sum += value;
		}

		System.out.println(sum);

		scanner.close();

	}

}
