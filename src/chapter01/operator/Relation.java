package chapter01.operator;

public class Relation {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b - 10); //산술 연산자가 관계연산자보다 우선 순위
		System.out.println(a <= b);
		
		boolean bool = (a ==b); //관계연산자가 대입 연산자보다 우선순위기 있어
		System.out.println(bool);
	}

}
