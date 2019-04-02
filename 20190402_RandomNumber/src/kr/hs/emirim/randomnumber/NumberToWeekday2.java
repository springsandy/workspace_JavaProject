package kr.hs.emirim.randomnumber;

import java.util.Scanner;

public class NumberToWeekday2 {
	public static void main(String[] args) {
		String[] weekdays= {"월","화","수","목","금","토","일"};
		
		Scanner scanner=new Scanner(System.in);
		int inputNumber=scanner.nextInt();
		System.out.println(weekdays[inputNumber-1]+"요일");
	}
}
