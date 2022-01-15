package task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int start = sc.nextInt();
        System.out.println("Enter second number:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
        System.out.println();
    }
}
