package chapter01.loop;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("power 값을 입력하세요 : "); //println에서 ln이 줄바꿈 [ \n : 줄바꿈 ]
		int power = s.nextInt();
		int result =1;
		
		for ( int i = 0; i<power; i++) {
			result = result * 2;
		}
		
		System.out.println("2의 "+power+"제곱근은 "+result+"입니다.");
		
		s.close();
	}

}
