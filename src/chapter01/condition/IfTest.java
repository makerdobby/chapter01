package chapter01.condition;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in); //Ctrl + Shift + o
		int a = s.nextInt(); //blocking
		int b = s.nextInt(); //blocking //세번째거 import
		
		int diff = 0;//차이, 차 , 뺀거의 절댓값
		
		if ( b >= a ) {
			diff = b - a;
		}
		else {
			diff = a - b;
		}
		
		// diff = (a>b) ? a-b : b-a; => 3항 연산자
		
		System.out.println(diff);
				
		
	}

}
