package kr.hs.emirim.randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int start=0;
		int end=99;
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		while(true) {
			//int guess =random.nextInt(end+1-start)+start;
			int guess=(end-start)/2;//최적화
			System.out.println(guess+"입니까?(1:정답, 2:UP, 3:Down)");
			int answer=scanner.nextInt();
			if(answer==1) {
				System.out.println("정답");
				break;
			}else if(answer==2) {
				start=guess+1;
			}else if(answer==3) {
				end=guess-1;
			}
		}
	}
}
