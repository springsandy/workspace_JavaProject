package hs.kr.emirim.pakeingfee;

import java.util.Scanner;

public class PakeingFee {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int time=sc.nextInt();
		a=time/10;
		b=time%10;
		if(time>=0 && time<=30) {
			System.out.println("2000���Դϴ�.");
		}else if(b>=1) {
			sum=(a-1)*1000+1000;
			System.out.println(sum+"���Դϴ�.");
		}
	}
}
