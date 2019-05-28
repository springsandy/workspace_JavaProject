package hs.kr.emirim.pakeingfee;

public class PakeingFee_2 {

	public static void main(String[] args) {
		int fee=0;
		int minutes=52;
		if(minutes<=30) {
			fee=1500;
		}else {
			minutes=minutes-30;
			fee+=1500;
			fee+=(minutes/10)*1000;
			if(minutes%0!=9) {
				fee+=1000;
			}
		}
		System.out.println("주차요금은 "+fee+"원입니다.");
	}

}
