package chapter01;

public class WhileTest {

	public static void main(String[] args) {
		
		/*
		 * while 문
		 */
		int i = 0;          			//1. 조건 초기화 [보통 0부터 시작]
		while( i < 10 ) { 				//2. 조건 ( 조건이 안 맞으면 탈출 )  [등호는 잘 안씀 ]
			System.out.println(i+1); 	//3.반복해야할 명령
			i++;						//4. 변화 조건 [<- 코드가 길어지면 이게 너무 아래에 있어서 보기 불편한 단점이 있어]
		}
		
	}

}
