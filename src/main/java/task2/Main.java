package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = 0, percent = 0;
        float result;
        System.out.println("Enter number:");
        number = input.nextDouble();
        System.out.println("Enter percent:");
        percent = input.nextDouble();
        result = (float) (percent * number / 100);
        System.out.println(result);
    }
}
