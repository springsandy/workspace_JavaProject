package kr.hs.emirim.studentnumber2major;

import java.util.Scanner;

public class StudentNumber2Major {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("�й��� �Է��Ͻÿ�.");
		while(true) {
			int an=sc.nextInt();
			a=an/1000;
			b=(an/100)%10;
			//System.out.println(a);
			//System.out.println(b);
			if(a==1 || a==2) {
				switch(b) {
					case 1:
					case 2:
						System.out.println("���̵�����Ʈ�����");
						break;
					case 3:
					case 4:
						System.out.println("���̵�����ַ�ǰ�");
						break;
					case 5:
					case 6:
						System.out.println("���̵������ΰ�");
						break;
				}
			}else if(a==3) {
				switch(b) {
				case 1:
				case 2:
					System.out.println("���ͷ�Ƽ��̵���");
					break;
				case 3:
				case 4:
					System.out.println("���̵������ΰ�");
					break;
				case 5:
				case 6:
					System.out.println("���̵��ַ�ǰ�");
					break;
				}
			}
		}
	}
}
