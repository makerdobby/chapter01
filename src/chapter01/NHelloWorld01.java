package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int n = 0;
		while (n < count ) {
			System.out.println("Hello"+"World");
			n++;
		}
			
		
		s.close(); //자원을 다 쓰고 나서는 꼭 닫아주기!!!
		
	}

}
