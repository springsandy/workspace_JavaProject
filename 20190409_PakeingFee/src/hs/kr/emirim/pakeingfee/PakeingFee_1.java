package hs.kr.emirim.pakeingfee;

import java.util.Scanner;

public class PakeingFee_1 {

	public static void main(String[] args) {
		int a,b,c,sum=1500;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int time=sc.nextInt();
		if(time==1440) {
			System.out.println("���� �� �� �����ϴ�.");
		}else if(time>=1 || time<=30) {
			System.out.println(sum+"���Դϴ�.");
		}else if(time<=31) {
			a=time-30;
			b=a/10;
			c=a%10;
			if(c>=1) {
				sum=sum+b*1000+1000;
				if(sum>=25000) {
					System.out.println("25000��");
				}
			}else {
				sum=sum+b*1000;
				if(sum>=25000) {
					System.out.println("25000��");
				}
			}
			System.out.println(sum+"���Դϴ�.");
		}
	}
}
