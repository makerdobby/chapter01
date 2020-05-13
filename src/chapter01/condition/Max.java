package chapter01.condition;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		int a3 = s.nextInt();
		
		/* 확인할 때 하나 하나 넣기 귀찮을 수 있으니까 이렇게 hard하게 넣어놓고 시작해봐 ㅎ
		 int a1 = 1;
		 int a2 = 7;
		 int a3 = 4;
		 */
		
		int max = 0;
		
		//자꾸 주석을 달면서 하면 편해
		if( a1 >= a2) {
			if( a1 > a3 ) { // a1 > a2, a1 > a3
				max = a1;
			}
			else {			// a1 > a2, a1 <= a3 ---> a3 >= a1 > a2
				max = a3;
			}
		}
		else { //a2 > a1
			if(a2 >= a3) { //a2>a1 & a1 <= 3 ---> a3 >= a1 > a2
				max = a2;
			}
			else { //a1>a2 
				max = a3; //a1>a2 & a1 <= a3 ---> a3 > a2> a1 
			}
		}
		
		System.out.println("max : " +  max);
	}

}
