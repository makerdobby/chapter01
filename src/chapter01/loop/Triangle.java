package chapter01.loop;

public class Triangle {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		for(i=0; i<6; i++) {
			for(j=0; j<=i ;j++) {
				System.out.print("X");
			}
			System.out.println("\n");
		}
		
		for(i=0; i<6; i++) {
			for(j=6; j>i ;j--) {
				System.out.print("X");
			}
			System.out.println("\n");
		}

	}

}
