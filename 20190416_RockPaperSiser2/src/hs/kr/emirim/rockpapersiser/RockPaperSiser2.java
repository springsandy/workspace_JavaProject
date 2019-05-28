package hs.kr.emirim.rockpapersiser;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSiser2 {

	public static void main(String[] args) {
		String[] pae= {"가위","바위","보"};
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("사용자의 입력을 말하자(1:가위, 2:바위, 3:보, 0:끝)");
			int p=scanner.nextInt();
			if(p==0) {
				break;
			}
			int c=makeComputer();
			int result=compare(p,c);
			System.out.println("사용자: "+pae[p-1]+"\t컴퓨터: "+pae[c-1]);
			if(result==-1) {
				System.out.println("졌다.");
			}else if(result==0) {
				System.out.println("비겼다");
			}else {
				System.out.println("이겼다.");
			}
		}

	}

	private static int compare(int p, int c) {
		if((p+1)%3==c) {
			return -1;
		}else if(p==c) {
			return 0;
		}else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random=new Random();
		int c=random.nextInt(3-1+1)+1;
		return c;
	}

}
