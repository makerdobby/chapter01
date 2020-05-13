package chapter01.loop;

public class BreakTest {

	public static void main(String[] args) {
		//0에서부터 계속 더하다가 합이 5000이상이 되면 중지.
		/*
		int number=0;
		int sum =0;
		
		while ( sum < 5000) {
			sum += number;
			number++;
		}
		System.out.println(number+":"+sum);
		*/
		
		int number=0;
		int sum =0;
		
		while ( true ) {
			sum += number;
			if(sum > 5000) {
				break;
			}
			number++;
		}
		System.out.println(number+":"+sum);
	}

}
