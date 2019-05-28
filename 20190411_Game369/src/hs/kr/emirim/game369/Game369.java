package hs.kr.emirim.game369;

public class Game369 {

	public static void main(String[] args) {
		for(int i=0; i<=99; i++) {
			String numberString=String.valueOf(i);
			int count = count369(numberString);
			if(count==0) {
				System.out.println(i);
			}else {
				for(int j=0; j<count; j++) {
					System.out.print("¦");
				}
				System.out.println();
			}
		}

	}
	private static int count369(String numberString) {
		int sum=0;
		for(int i=0; i<numberString.length(); i++) {
			char ch0=numberString.charAt(i);
			if(ch0=='3' || ch0=='6' || ch0=='9') {
				sum++;
			}
		}
		return sum;
	}
}


