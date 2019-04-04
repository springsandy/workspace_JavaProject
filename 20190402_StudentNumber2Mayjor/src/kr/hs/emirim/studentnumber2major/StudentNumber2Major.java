package kr.hs.emirim.studentnumber2major;

import java.util.Scanner;

public class StudentNumber2Major {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("학번을 입력하시오.");
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
						System.out.println("뉴미디어소프트웨어과");
						break;
					case 3:
					case 4:
						System.out.println("뉴미디어웹솔루션과");
						break;
					case 5:
					case 6:
						System.out.println("뉴미디어디자인과");
						break;
				}
			}else if(a==3) {
				switch(b) {
				case 1:
				case 2:
					System.out.println("인터렉티브미디어과");
					break;
				case 3:
				case 4:
					System.out.println("뉴미디어디자인과");
					break;
				case 5:
				case 6:
					System.out.println("뉴미디어솔루션과");
					break;
				}
			}
		}
	}
}
