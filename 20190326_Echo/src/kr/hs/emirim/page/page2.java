package kr.hs.emirim.page;

import java.util.Scanner;

public class page2 {
	public static void main(String args[]) {
		int nPerPage=7;
		Scanner scanner= new Scanner(System.in);
		while(true) {
			System.out.print("�� ���� �Խù��� ǥ���ұ��?(������ ������.)");
			String inputString=scanner.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("��");
				break;
			}
			int result=Integer.parseInt(inputString);
			int ��� = result/nPerPage+1;
			if(result%nPerPage == 0) {
				��� = result/nPerPage;
			}
			System.out.println(���+"�������� �ʿ��մϴ�.");
		}
	}
}
