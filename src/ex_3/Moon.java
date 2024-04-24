package ex_3;

import java.util.Scanner;

public class Moon {

    public static void main(String[] args) {
        System.out.println("오늘 점심 메뉴 무엇을 먹을까요?");
        System.out.println("1.된장찌개 2.돼지국밥 3.제육볶음 4.불고기 5.비빔밥");
        Scanner scanner = new Scanner(System.in);

        String[] foodMenu = new String[5]; // Declare and initialize the foodMenu array

        // Input lunch menu options into the array
        int count = 0; // Counter for the number of inputs
        while (count < 5) {
            foodMenu[count] = scanner.next();
            count++;
        }

        // Display the lunch menu options
        for (int i = 0; i < foodMenu.length; i++) {
            System.out.println("상용이가 좋아하는 점심 메뉴01: " + foodMenu[i]);
        }

        // Close the scanner after input and processing is complete
        scanner.close();
    }
}


