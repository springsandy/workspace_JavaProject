package kr.hs.erimrim.numbertoweekday;

import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("���� �߿� �Է��Ͻÿ�.(1~7)");
			int an=scanner.nextInt();
			//if(an==1) {
			//	System.out.println("������");			
			//}else if(an==2) {
			//	System.out.println("ȭ����");
			//}else if(an==3) {
			//	System.out.println("������");
			//}else if(an==4) {
			//	System.out.println("�����");
			//}else if(an==5) {
			//	System.out.println("�ݿ���");
			//}else if(an==6) {
			//	System.out.println("�����");
			//}else if(an==7) {
			//	System.out.println("�Ͽ���");
			//}
			switch(an) {
				case 1:
					System.out.println("��");
					break;
				case 2:
					System.out.println("ȭ");
					break;
				case 3:
					System.out.println("��");
					break;
				case 4:
					System.out.println("��");
					break;
				case 5:
					System.out.println("��");
					break;
				case 6:
					System.out.println("��");
					break;
				case 7:
					System.out.println("��");
					break;
			}
		}
		
	}

}
