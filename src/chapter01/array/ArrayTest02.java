package chapter01.array;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		/*배열 정의 1*/		int a1[]; //의미상 비추천
		
		/*배열 정의2*/		int[] a2;

		/*잘못된 정의*/// 	int[10] a2; 오류 : 배열의 '크기'는 배열객체생성(new)와 함께해야한다.
	
		/*
		 * 배열 초기화
		 */
		a2	 = new int[3];
		a2[0]=0;
		a2[1]=0;
		a2[2]=0;
		
		//배열과 생성을 동시에..!
		int[] a3= {0,1,2}; //이건 편하라고 허용해줌
		
		//비추천
		int[] a4 = new int[] {0,1,2}; //의미상 가장 맞는데 넘 길엉...
		
		//배열 초기화 오류
		//int[] a4;
		//a4 = {0,1,2};   -> 이렇게 따로 쓰면 안됨 
		
		//비추천
		
		
		
		
	}

}
