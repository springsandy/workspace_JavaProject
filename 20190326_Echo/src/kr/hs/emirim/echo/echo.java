package kr.hs.emirim.echo;

import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("�Է��Ͻÿ�.");
			String an=scanner.nextLine();
			if(an.equals("exit")) {
				System.out.println("��");
				break;
			}
			System.out.println(an);
		}
	}

}
