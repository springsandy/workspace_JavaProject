package kr.hs.emirim.studentnumber2major;

import java.util.Scanner;

public class StudentNumber2Major_1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("학과를 구할 학번을 입력하세요.");
		String studentNumber=scanner.nextLine();
		String grade=studentNumber.substring(0, 1);
		char gradech=studentNumber.charAt(0);
		String classroom=studentNumber.substring(1,2);
		char classroomch=studentNumber.charAt(1);
		if(grade.equals("1") || grade.equals("2")) {
			if(classroom.equals("1") || classroom.equals("2")) {
				System.out.println("뉴미디어소프드웨어과");
			}else if(classroom.equals("3") || classroom.equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			}else if(classroom.equals("5") || classroom.equals("6")) {
				System.out.println("뉴미디어디자인과");
			}
		}else if(gradech == '3') {
			switch(classroomch) {
			case '1':
			case '2':
				System.out.println("인터렉티브미디어과");
				break;
			case '3':
			case '4':
				System.out.println("뉴미디어디자인과");
				break;
			case '5':
			case '6':
				System.out.println("뉴미디어솔루션과");
				break;
			}
		}
	}

}
