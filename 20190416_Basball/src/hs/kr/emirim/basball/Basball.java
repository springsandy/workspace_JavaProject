package hs.kr.emirim.basball;

import java.util.Random;
import java.util.Scanner;

public class Basball {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String c=makeComputer();
		while(true) {
			String p=scanner.nextLine();
			boolean isEnd= play(p,c);
			if(isEnd==true) {
				System.out.println("HIT");
				break;
			
			}
		}
	}

	private static String makeComputer() {
		StringBuffer buffer=new StringBuffer();
		Random random =new Random();
		for(int i=0; i<3;) {
			int r=random.nextInt(9-1+1)+1;
			String rString =String.valueOf(r);
			if(buffer.toString().contains(rString)==false) {
				buffer.append(rString);
				i++;
			}	
			for(int j=0; j<i; j++) {
				if(buffer.charAt(j)==rString.charAt(i)) {
					continue;
				}
			}
		}
		return buffer.toString();
	}

	private static boolean play(String p, String c) {
		int strike=0, ball=0;
		for(int i=0; i<p.length(); i++) {
			for(int j=0; j<c.length(); j++) {
				if(p.charAt(i)==c.charAt(j)) {
					if(i==j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		System.out.println(p+"\tstrike: "+strike+"\tball: "+ball);
		if(p.equals(c)) {
			return true;
		}
		return false;
	}

}
