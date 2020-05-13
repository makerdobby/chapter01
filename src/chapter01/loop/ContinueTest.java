package chapter01.loop;

public class ContinueTest {

	public static void main(String[] args) {
		
		//2의 배수랑 3의 배수를 "제외하고 " 출력하라
		for (int i = 0; i < 20; i++) {
			/*
			if (i % 2 == 0 || i % 3 == 0) { 
				continue; //이걸 만나면 밑으로 안떨어지고 다음 조건변화실행
			}
			*/ //근데 이렇게 하기 보단,,,밑에 처럼 따로 적는게 나음
			
			if(i%2 == 0) {
				continue;
			}
			
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.println(i);

		}
	}
} //indent 정리는 Ctrl + Shift + f (format 의 f) 
 //import는 Ctrl + Shift + o (import의 o)
