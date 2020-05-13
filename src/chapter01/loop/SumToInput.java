package chapter01.loop;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		//입력
		Scanner s = new Scanner(System.in);
		System.out.print("입력> ");//println하면 안예쁨
		int number = s.nextInt();
		
		//처리 0~number 합
		int sum=0;//for문 안에서 정의하면 밖에서 쓸 수 없어서 for문 밖에 정의해야함
		for(int i=1; i <= number ; i++) {
		
			sum = sum + i;
		}
		
		//출력
		System.out.println(sum);
		
	}

}
