package kr.hs.emirim.studentnumber2major;

import java.util.Scanner;

public class StudentNumber2Major_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�а��� ���� �й��� �Է��ϼ���.");
		String studentNumber=scanner.nextLine();
		String grade=studentNumber.substring(0, 1);
		char gradech=studentNumber.charAt(0);
		String classroom=studentNumber.substring(1,2);
		char classroomch=studentNumber.charAt(1);
		if(grade.equals("1") || grade.equals("2")) {
			if(classroom.equals("1") || classroom.equals("2")) {
				System.out.println("���̵�����������");
			}else if(classroom.equals("3") || classroom.equals("4")) {
				System.out.println("���̵�����ַ�ǰ�");
			}else if(classroom.equals("5") || classroom.equals("6")) {
				System.out.println("���̵������ΰ�");
			}
		}else if(gradech == '3') {
			switch(classroomch) {
			case '1':
			case '2':
				System.out.println("���ͷ�Ƽ��̵���");
				break;
			case '3':
			case '4':
				System.out.println("���̵������ΰ�");
				break;
			case '5':
			case '6':
				System.out.println("���̵��ַ�ǰ�");
				break;
			}
		}
	}

}
