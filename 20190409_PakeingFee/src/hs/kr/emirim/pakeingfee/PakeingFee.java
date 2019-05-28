package hs.kr.emirim.pakeingfee;

import java.util.Scanner;

public class PakeingFee {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("분을 입력하시오 : ");
		int time=sc.nextInt();
		a=time/10;
		b=time%10;
		if(time>=0 && time<=30) {
			System.out.println("2000원입니다.");
		}else if(b>=1) {
			sum=(a-1)*1000+1000;
			System.out.println(sum+"원입니다.");
		}
	}
}
