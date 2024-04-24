package ex_4;

import java.util.Scanner;

public class lunchlaunch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] strarray = new String[5];
		
		
		
		for (int i = 0; i < strarray.length; i++) {
			strarray[i] = scanner.next();
			System.out.println("좋아하는 점심메뉴" + strarray[i]);
		}
			
		for (int i = 0; i < strarray.length; i++) {
			System.out.println("점매추 :" + strarray[i]);
		}
	}

}
