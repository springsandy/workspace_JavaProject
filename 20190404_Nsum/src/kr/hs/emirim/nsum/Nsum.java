package kr.hs.emirim.nsum;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		int a,b,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력하시오.");
		int an=sc.nextInt();
		a=an/100;
		b=(an/10)%10;
		c=an%10;
		sum=a+b+c;
		System.out.println(sum);
	}

}
