package chapter01.loop;

import java.util.Scanner;

public class NHelloWorld02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		
		for( int i = 0; i < count ; i++) {
			System.out.println("Hello World");
		}
			
		
		s.close(); //자원을 다 쓰고 나서는 꼭 닫아주기!!!
		
	}

}
