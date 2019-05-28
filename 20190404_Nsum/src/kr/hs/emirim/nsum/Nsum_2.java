package kr.hs.emirim.nsum;

import java.util.Scanner;

public class Nsum_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		int length=number.length();
		Nsum_2(number, length);
	}

	private static void Nsum_2(String number, int length) {
		int sum=0;
		for(int i=0; i<length; i++) {
			char n = number.charAt(i);
			sum+=n-'0';
		}
		System.out.println(sum);
	}

}
