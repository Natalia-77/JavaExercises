package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c;
        int res = 0;
        String[] numbers = new String[3];
        int[] nums = new int[3];
        System.out.println("Введіть три цифри:");
        System.out.print("first ");
        a = input.nextLine();
        numbers[0] = a;
        System.out.print("друга:   ");
        b = input.nextLine();
        numbers[1] = b;
        System.out.print("третя:   ");
        c = input.nextLine();
        numbers[2] = c;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i].matches("\\d")) {

                int number = Integer.valueOf(numbers[i]);
                nums[i] = number;
            } else {
                System.out.println("Одне з введених значень не було числом.");
                nums[i] = 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            res = nums[0] * 100 + nums[1] * 10 + nums[2];
        }
        System.out.println(res);
    }

}
