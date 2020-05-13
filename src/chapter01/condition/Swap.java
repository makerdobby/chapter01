package chapter01.condition;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		// int temp = 0;  얘를 전역변수처럼 쓰면 안돼
		
		if( n2 > n1 ) {
			int temp = 0; // 이렇게 여기서만 쓰고 사라질 거는 여기서 정의하는게 나아
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		
		// Q1: n1이 큰 값이 되도록 출력할 것
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

	}

}
