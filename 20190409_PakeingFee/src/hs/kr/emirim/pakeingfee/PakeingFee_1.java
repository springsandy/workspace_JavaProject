package hs.kr.emirim.pakeingfee;

import java.util.Scanner;

public class PakeingFee_1 {

	public static void main(String[] args) {
		int a,b,c,sum=1500;
		Scanner sc=new Scanner(System.in);
		System.out.print("분을 입력하시오 : ");
		int time=sc.nextInt();
		if(time==1440) {
			System.out.println("차를 뺄 수 없습니다.");
		}else if(time>=1 || time<=30) {
			System.out.println(sum+"원입니다.");
		}else if(time<=31) {
			a=time-30;
			b=a/10;
			c=a%10;
			if(c>=1) {
				sum=sum+b*1000+1000;
				if(sum>=25000) {
					System.out.println("25000원");
				}
			}else {
				sum=sum+b*1000;
				if(sum>=25000) {
					System.out.println("25000원");
				}
			}
			System.out.println(sum+"원입니다.");
		}
	}
}
