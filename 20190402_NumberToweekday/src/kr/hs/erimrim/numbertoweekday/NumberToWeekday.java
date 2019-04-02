package kr.hs.erimrim.numbertoweekday;

import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("숫자 중에 입력하시오.(1~7)");
			int an=scanner.nextInt();
			//if(an==1) {
			//	System.out.println("월욜일");			
			//}else if(an==2) {
			//	System.out.println("화요일");
			//}else if(an==3) {
			//	System.out.println("수요일");
			//}else if(an==4) {
			//	System.out.println("목요일");
			//}else if(an==5) {
			//	System.out.println("금요일");
			//}else if(an==6) {
			//	System.out.println("토요일");
			//}else if(an==7) {
			//	System.out.println("일요일");
			//}
			switch(an) {
				case 1:
					System.out.println("월");
					break;
				case 2:
					System.out.println("화");
					break;
				case 3:
					System.out.println("수");
					break;
				case 4:
					System.out.println("목");
					break;
				case 5:
					System.out.println("금");
					break;
				case 6:
					System.out.println("토");
					break;
				case 7:
					System.out.println("일");
					break;
			}
		}
		
	}

}
