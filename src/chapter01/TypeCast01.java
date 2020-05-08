package chapter01;

public class TypeCast01 {

	public static void main(String[] args) {
		//implicity( 암시적 캐스팅 )
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		// explicity( 명시적 캐스팅)
		long l2 = 123456789;
		int i2 = (int)l2;
		System.out.println(i + ":" + l);
	}

}
