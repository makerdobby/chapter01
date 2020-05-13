package chapter01.variable;

public class ArithTest01 {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		//산술 연산자 (Arithmetic Opertator)
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		//[int op int] => int
		System.out.println( 10 / 3);
		
		//[int op double] => double
		System.out.println( 10 / 3.);
		
		//주의
		System.out.println("===");
		System.out.println((double)10 / 3   );
		System.out.println((double)(10 / 3) );
		
		//증감연산자(단항연산자) i++  vs ++i
		a = 1;
		System.out.println(a);
		a++; // <=> a = a + 1;
		     // <=> a += 1;
		System.out.println(a);
		
		a--; // <=> a -= 1;
		     // <=> a = a - 1;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		System.out.println("여기까진 차이가 없지");
		
		System.out.println("전위 연산자");
		a=1;
		System.out.println(++a);
		//a = a + 1;
		//System.out.println(a)
		System.out.println(a);

		System.out.println("후위 연산자");
		a=1;
		System.out.println(a++);
		//System.out.println(a)
		//a = a + 1
		System.out.println(a);
		
		//근데 이런 방식은 안쓰는게 좋아 그냥 함수하나 쓰면되지뭐..이게 c++도 아니고... java는 비지니스 언어니까 꼭 간단하게
		
	}

}
