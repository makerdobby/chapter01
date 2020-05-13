package chapter01.variable;

public class TypeCast02 {

	public static void main(String[] args) {
		byte b = 25;
		short s = b; //암시적
		
		int i = s;
		long l = i;//암시적
		
		float f = i;//암시적
		
		double d = f;//암시적

		byte b1 = (byte)256;//명시적

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);


	}

}
