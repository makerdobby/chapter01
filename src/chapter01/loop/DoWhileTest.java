package chapter01.loop;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum =0;
		int value;
		do {
			System.out.print("숫자입력[ -1 to quit]> ");
			value = scanner.nextInt();
			
			if( value != -1) {
				sum += value;
			}
		} while(value != -1);
		
		System.out.println(sum);
		
		scanner.close();
	}

}
