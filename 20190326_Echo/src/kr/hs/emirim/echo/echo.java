package kr.hs.emirim.echo;

import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.print("입력하시오.");
			String an=scanner.nextLine();
			if(an.equals("exit")) {
				System.out.println("끝");
				break;
			}
			System.out.println(an);
		}
	}

}
