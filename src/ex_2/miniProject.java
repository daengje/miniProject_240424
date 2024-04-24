package ex_2;

import java.util.Scanner;

public class miniProject {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String[] foodMenu = new String[5];
		foodMenu[0] = "마라탕";
		foodMenu[1] = "꿔바로우";
		foodMenu[2] = "닭갈비";
		foodMenu[3] = "돼지국밥";
		foodMenu[4] = "볶음밥";
		//하나 입력 -> 하나 출력
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = scanner.next();
			System.out.println("좋아하는 점심 메뉴 : " + foodMenu[i]);
			
		}
		//모두 입력된 배열을 다 출력
		for (int i = 0; i < foodMenu.length; i++) {
			System.out.println("상용이가 좋아하는 점심 메뉴 : " + foodMenu[i]);
		}
	}
}
