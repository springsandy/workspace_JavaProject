package kr.hs.emirim.updown;

import java.util.Random;
import java.util.Scanner;

public class updown {

	public static void main(String[] args) {
		Random random=new Random();
		int rNumber=random.nextInt(100);
		rNumber+=rNumber;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			int an=scanner.nextInt();
			if(rNumber==an) {
				System.out.println("³¡");
				break;
			}else if(rNumber<an) {
				System.out.println("DOWN");
			}else if(rNumber>an) {
				System.out.println("UP");
			}
		}
		
	}

}
