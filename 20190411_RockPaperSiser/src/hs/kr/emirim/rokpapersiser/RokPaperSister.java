package hs.kr.emirim.rokpapersiser;

import java.util.Random;
import java.util.Scanner;

public class RokPaperSister {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int p=1;
		int c=makeComputer();
		int result=compare(p,c);
	}
	private static int compare(int p,int c) {
		return 0;
	}
	private static int makeComputer() {
		Random random=new Random();
		int c = random.nextInt(3-1+1)+1;
		return c;
	}
}
