package chapter01;

public class VariableTest {
	public static void main (String[] args) {
		/*
		 * 1. 자료형(Data Type) : 기본형 (primitive Type) 8개
		 */
		//정수
		byte b = 10; //1byte (-128~127) //통신
		short s = 10; //2byte
		int i =10 ;  //4byte | 00000000 | 00000000 | 00000000 | 00001010 |이렇게 저장돼 ㅋㅋ 낭비 개 심하지?
		long l = 1234567; //8byte
		
		//실수
		float f = 3.14f; //4byte  뒤에 f안쓰면 오류뜨는데 double로 쓸까 고민해서그래 그래서 그냥 float로 하라고 f써
		double d = 3.14; //8byte
		
		//문자
		char c = 'A'; //2byte
		char h= '핳';
		
		//부울대수
		boolean bool = true; //1byte 1bit로도 될 것 같지만 꼭 byte단위여야돼 1byte = 8bit 얘도 역시 | 00000001 |요따구로 저장돼
		
		
	
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(c);
		System.out.println(h);
		
		System.out.println(bool);
		
		/*
		 * char 형
		 */
		char c2 = 'A';
		int i2 = 65;
		System.out.println("=============");
		System.out.println(c2-i2);
		
		
		/*
		 * 2. 자료형(Data Type) : 객체 참조형 (reference Type)
		 */
		
		//문자열 => 기본타입에는 없음
		//그럼 뭔데??? char가 모여있는 string 'class'이다. API중에 하나인거지..!! WOW! 그리고 무한 배열
		String str = "Hello World"; // = char[] str = "Hello World";
		
		String str2 = new String("Hello World"); //얘도 사실 이렇게 써야돼 원래는
		
		/*
		 * 3. 변수 초기화
		 */
		//지역변수 : Scope(변수가 살아있는 범위)가 block안임. i를 다른함수에서 쓰면 에러나니까 i정의한 함수에서 쓰듯이 => 초기화를 반드시 해줘야함.
			int j; //(x)
			//System.out.println(j); 이러면 안나오겠지?
			
		//객체변수(instance) : Scope가 객체안임. 객체 안의 변수를 (나이, 이름 ) 이런거 => 0으로 자동초기화
		
		//전역변수
		
		
		/*
		 * 4. 상수
		 */
		//변수 vs 상수
		final int number = 1000;
		/* number = 20000; */ //이거하면 에러남! 오류 : 초기화시 final이 붙은 변수는 다음코드에서 값을 대입할 수 없다.
		System.out.println(number);
		//그리고 상수는 다 대문자로!!!
		final int NUMBER = 1000;
		final double PI = 3.1414213; //이렇게 고정해놓고 할 아이들에 사용
		
		
		
	}
}
