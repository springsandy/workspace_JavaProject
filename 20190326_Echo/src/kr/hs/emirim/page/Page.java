package kr.hs.emirim.page;

import java.util.Scanner;

public class Page {

	public static void main(String[] args) {
		//int nPerPage=7;
		//int result=331;
		//int ��� = result/nPerPage+1;
		//if(result%nPerPage == 0) {
		//	��� = result/nPerPage;
		//}
		//System.out.println(���+"�������� �ʿ��մϴ�.");
		
		int nPerPage=7;
		System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
		Scanner scanner= new Scanner(System.in);
		int result=scanner.nextInt();
		int ��� = result/nPerPage+1;
		if(result%nPerPage == 0) {
			��� = result/nPerPage;
		}
		System.out.println(���+"�������� �ʿ��մϴ�.");

	}

}
