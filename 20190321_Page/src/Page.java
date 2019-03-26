import java.util.*;

public class Page {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("페이지 개수?");
		int page = sc.nextInt();
		int a=7;
		int b;
		int c;
		c=page/a;
		b=page%a;
		if(b>0) {
			c++;
		}
		System.out.println(c);
	}
}
