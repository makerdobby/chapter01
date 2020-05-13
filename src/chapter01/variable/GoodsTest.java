package chapter01.variable;

public class GoodsTest {
	
	public static void mian ( String[] args) {
		int i = 10; //이거처럼~
		
		Goods g1 = new Goods(); //일단 공간확보가 필요! Goods() 클래스 참고해서 그 크기만큼 덩어리 만들어놔~ g가 바로 객체!
		g1.price =1000;
		
		//======================================
		
		int j= i;
		Goods g2= g1;
		//======================================
		System.out.println(j + ":" + i);
		System.out.println(g2.price + ":" + g1.price);
		
		//======================================
		System.out.println(i + ":" + g1);
	}

}