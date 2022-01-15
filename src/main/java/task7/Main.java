package task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter first num:");
        int left = sc.nextInt();
        System.out.println("Enter second num:");
        int right = sc.nextInt();
        if (left > right) {
            left = left + right - (right = left);
            for (int i = left; i <= right; i++) {
                if (i % 2 == 1) {
                    list.add(i);
                }
            }
        } else {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 1) {
                    list.add(i);
                }
            }
        }
        for (Integer item : list) {
            System.out.print(item + " ");
        }
    }
}
