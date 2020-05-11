package chapter01;

public class Bitwise {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		
		System.out.println(a&b); // 0000 0100 * 0000 0010
		System.out.println(a | b); //0000 0100 + 0000 0010
		System.out.println(a ^ b);
		System.out.println(~a); // 0000 0100 => 1111 1011	그대로 뒤집어	
		System.out.println(a>>3); 
		System.out.println(a<<3);
		
		System.out.println(Integer.toBinaryString(~b)); // 0010 => 1101

	}

}
