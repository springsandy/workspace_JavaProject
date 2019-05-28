package hs.kr.emirim.rockpapersiser;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSiser2 {

	public static void main(String[] args) {
		String[] pae= {"����","����","��"};
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("������� �Է��� ������(1:����, 2:����, 3:��, 0:��)");
			int p=scanner.nextInt();
			if(p==0) {
				break;
			}
			int c=makeComputer();
			int result=compare(p,c);
			System.out.println("�����: "+pae[p-1]+"\t��ǻ��: "+pae[c-1]);
			if(result==-1) {
				System.out.println("����.");
			}else if(result==0) {
				System.out.println("����");
			}else {
				System.out.println("�̰��.");
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
