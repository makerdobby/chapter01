package chapter01.loop;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("power 값을 입력하세요 : "); //println에서 ln이 줄바꿈 [ \n : 줄바꿈 ]
		int power = s.nextInt();
		int result =1;
		
		int i = 0;
		while(i<power) {
			result = result * 2; // <=> result *= 2 와 동일
			i++;
		}
		
		System.out.println("2의 "+power+"제곱근은 "+result+"입니다.");
		
		s.close();
	}

}
