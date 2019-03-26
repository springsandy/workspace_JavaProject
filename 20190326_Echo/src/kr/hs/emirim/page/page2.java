package kr.hs.emirim.page;

import java.util.Scanner;

public class page2 {
	public static void main(String args[]) {
		int nPerPage=7;
		Scanner scanner= new Scanner(System.in);
		while(true) {
			System.out.print("몇 개의 게시물을 표시할까요?(정수로 쓰세요.)");
			String inputString=scanner.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("끝");
				break;
			}
			int result=Integer.parseInt(inputString);
			int 결과 = result/nPerPage+1;
			if(result%nPerPage == 0) {
				결과 = result/nPerPage;
			}
			System.out.println(결과+"페이지가 필요합니다.");
		}
	}
}
