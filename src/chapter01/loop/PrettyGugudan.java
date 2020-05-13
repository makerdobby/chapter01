package chapter01.loop;

public class PrettyGugudan {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		for( j=1; j<=9 ; j++) {
			for(i=1 ; i<=9;i++) {
				System.out.print(i+" X "+j+" = "+(i*j)+"\t"); //tab
			}
			System.out.print("\n");
		}

	}

}
