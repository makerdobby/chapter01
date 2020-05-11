package chapter01;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) { //그 달이 며칠 있는가.
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int days = 0;
		
		/*
		if( month ==1 ) {
			days = 31;
		}
		else if (month == 2) {
			days =  28;
		}
		else if (month == 3) {
			days =  31;
		}
		else if (month == 4) {
			days =  30;
		}
		else if (month == 5) {
			days =  31;
		}
		else if (month == 6) {
			days =  30;
		}
		else if (month == 7) {
			days =  31;
		}
		else if (month == 8) {
			days =  31;
		}
		else if (month == 9) {
			days =  30;
		}
		else if (month == 10) {
			days =  31;
		}
		else if (month == 11) {
			days =  30;
		}
		else if (month == 12) {
			days =  31;
		}
		else {
			System.out.println("1~12월 까지만 넣어주세요");
			return; //main을 탈출하고 싶을 땐 return을 하자!
		}
		
		if( month ==1 || month ==3 || month ==5 || month ==7 ||month ==8 || month ==10 || month ==12) {
			days = 31;
		}
		else if(month ==4 || month == 6 ||month ==9 || month == 11 ) {
			days = 30;
		}
		else if( month == 2) {
			days = 28;
		}
		else {
			System.out.println("1~12월 까지만 넣어주세요");
			return;
		}
		*/
		
		switch( month ) { // break를 넣어야 switch밖으로 나가
		case 1: //break를 안하면 밑으로 떨어져
		case 3: 
		case 5: 
		case 7: 
		case 8: 
		case 10: 
		case 12: {
			days = 31;
			break;
		}
		
		case 2: //블럭안써도됨 ㅎ
			days = 28;
			break;
		
		
		case 4: 
		case 6:
		case 9: 
		case 11: {
			days = 30;
			break;
		}
		
	
		default: { //else같은거
			System.out.println("1~12월 까지만 넣어주세요");
			return;
		}
		
		}
			
		System.out.println(month + "월은" + days + "일 까지 있습니다.");
	}

}
